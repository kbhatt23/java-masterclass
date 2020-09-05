package com.base;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

//REMOVING SETTERS FOR IMMUTABILITY
public final class ImmutableClassV2 {
	

	@Override
	public String toString() {
		return "ImmutableClassV2 [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", classObject="
				+ classObject + ", reference=" + reference + "]";
	}
	// immutable means data once initialzed can not be changed at all
	private final int id;
	private final String name;
	private final Integer birthDate;
	private final BasicClassForCollection classObject;
	private final Map<BasicClassForCollection, BasicClassForCollection> reference;

	

	public ImmutableClassV2(int id, String name, Integer birthDate, BasicClassForCollection classObject, Map<BasicClassForCollection, BasicClassForCollection> reference) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		//do deep copy
		this.classObject = new BasicClassForCollection(classObject);
		this.reference= reference.entrySet().stream().collect(Collectors.toMap(entry ->{ 
			Entry<BasicClassForCollection, BasicClassForCollection> entryMap = (Entry<BasicClassForCollection, BasicClassForCollection>) entry;
			return new BasicClassForCollection(entryMap.getKey());
			}, entry ->{ 
				Entry<BasicClassForCollection, BasicClassForCollection> entryMap = (Entry<BasicClassForCollection, BasicClassForCollection>) entry;
				return new BasicClassForCollection(entryMap.getValue());
				}));
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getBirthDate() {
		return birthDate;
	}

	public BasicClassForCollection getClassObject() {
		
		return new BasicClassForCollection(this.classObject);
	}
	public Map<BasicClassForCollection, BasicClassForCollection> getReference() {
		return reference.entrySet().stream().collect(Collectors.toMap(entry ->{ 
			Entry<BasicClassForCollection, BasicClassForCollection> entryMap = (Entry<BasicClassForCollection, BasicClassForCollection>) entry;
			return new BasicClassForCollection(entryMap.getKey());
			}, entry ->{ 
				Entry<BasicClassForCollection, BasicClassForCollection> entryMap = (Entry<BasicClassForCollection, BasicClassForCollection>) entry;
				return new BasicClassForCollection(entryMap.getValue());
				}));
	}

}
