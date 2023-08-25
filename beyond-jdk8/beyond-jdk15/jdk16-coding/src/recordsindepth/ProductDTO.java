package recordsindepth;

//record can not extend any class
//can implement any interfaces
public record ProductDTO(Long id, String name)
        /* extends  FeatureClass*/
    implements Bounceable
{
    public ProductDTO{
        if(id == null || id <=0 || name == null || name.isBlank())
            throw new IllegalArgumentException();
    }

    @Override
    public void bounce() {
        System.out.println("product bouncing with details: "+toString());
    }
}
