package recordsindepth;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductRatingRunner {
    public static void main(String[] args) {
        Map<String,Double> productRatingMap = Map.of("mi tv", 4.3d,
        "lg tv" , 4.2d , "lenovo laptop", 4.4d, "water bottle", 3.9d
        );


       List<ProductRating> productRatingList = productRatingMap.entrySet()
                .stream()
                .map(ProductRating::new)
                .toList();

       System.out.println(productRatingList);

    }
}
