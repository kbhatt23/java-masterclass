package recordsindepth;

public class ProductDTORunner {
    public static void main(String[] args) {
        //no arg constructor wont be added
        //ProductDTO fake = new ProductDTO();

        ProductDTO one = new ProductDTO(101L,"king");
        System.out.println(one);
        System.out.println(one.id()+":"+one.name());

        Bounceable two = new ProductDTO(108L,"Kanhayya");
        two.bounce();
    }
}
