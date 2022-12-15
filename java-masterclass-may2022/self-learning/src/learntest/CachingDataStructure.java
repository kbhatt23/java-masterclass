package learntest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;


interface TimeProvider {
    long getMillis();
}

class TimeProviderImpl implements TimeProvider{
 public long getMillis(){
     return System.currentTimeMillis();
 }
}

class CacheValue{
	
	private String key;
	
	private long epochTTL;
	
	private long ttl;

	public CacheValue(String key, long epochTTL, long ttl) {
		this.key = key;
		this.epochTTL = epochTTL;
		this.ttl=ttl;
	}


	public long getTtl() {
		return ttl;
	}


	public void setTtl(long ttl) {
		this.ttl = ttl;
	}


	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getEpochTTL() {
		return epochTTL;
	}

	public void setEpochTTL(long epochTTL) {
		this.epochTTL = epochTTL;
	}

	
	
}
public class CachingDataStructure {

    private int maxSize;
    private TimeProvider timeProvider;
    
    private final Map<String, CacheValue> storage;
    
    private int size = 0;
    
    private long lowestTTL = Long.MAX_VALUE;

    CachingDataStructure(TimeProvider timeProvider, int maxSize) {
        this.timeProvider = timeProvider;
        this.maxSize = maxSize;
        //no need to regrow
        storage = new HashMap<>(maxSize);
    }

    public void put(String key, String value, long timeToLeaveInMilliseconds) {
        validateEntry(key, value, timeToLeaveInMilliseconds);

        CacheValue cacheValue = new CacheValue(value, timeToLeaveInMilliseconds + timeProvider.getMillis(), timeToLeaveInMilliseconds);
        if(!storage.containsKey(key)) {
        	if(size >= maxSize) {
            	//full
        		 Iterator<Entry<String, CacheValue>> iterator = storage.entrySet().iterator();
        		 	long lowest = 0;
        		 	String lowestKey = null;
        		 	while(iterator.hasNext()) {
        		 		Entry<String, CacheValue> entry = iterator.next();
        		 		CacheValue entryValue = entry.getValue();
						if(entryValue.getTtl() < lowest) {
        		 			lowest = entryValue.getTtl();
        		 			lowestKey = entry.getKey();
        		 		}
        		 	}
        		 	
        		 	if(lowestKey != null)
        		 		storage.remove(lowestKey);
            }
        	size ++;
        }
    	storage.put(key, cacheValue);
    	
    	if(timeToLeaveInMilliseconds < lowestTTL) {
    		lowestTTL = timeToLeaveInMilliseconds;
    	}
    	
    }

	private void validateEntry(String key, String value, long timeToLeaveInMilliseconds) {
		if(timeToLeaveInMilliseconds <= 0) {
        	throw new IllegalArgumentException("timeToLeaveInMilliseconds can not be negative");
        }

		if(size != 0 &&  !storage.containsKey(key) && timeToLeaveInMilliseconds < lowestTTL) {
			throw new IllegalArgumentException("timeToLeaveInMilliseconds can not be less than lowest TTL");
		}
        //assuming cache should not allow null entries
        if(key == null || value == null) {
        	throw new IllegalArgumentException("cache key or value can not be null");
        }
        
	}

    public Optional<String> get(String key) {
    	
    	CacheValue cacheValue = storage.get(key);
    	
    	if(cacheValue == null) {
    		return Optional.empty();
    	}
    	
    	if(cacheValue.getEpochTTL() < timeProvider.getMillis()) {
    		storage.remove(key);
    		size--;
    		return Optional.empty();
    	}
    	
    	return Optional.of(cacheValue.getKey());
    }

    public int size() {
        return  size;
    }

}
