package recordsindepth;

import java.util.Map;

public record ProductRating(String name, Double rating) {

    //jdk auto creates a canonical constructor
    //we can overload it by custom constructor
   public ProductRating(Map.Entry<String,Double> ratingEntry){
       this(ratingEntry.getKey(), ratingEntry.getValue());
   }

    //can also override any method
    @Override
    public String toString() {
        return "ProductRating.name: "+this.name + ", ProductRating.rating: "+this.rating;
    }
}
