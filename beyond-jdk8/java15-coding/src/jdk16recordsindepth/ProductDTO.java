package jdk16recordsindepth;

public record ProductDTO(Long id, String name, Double price) {

	public ProductDTO {
		if(name == null || name.isBlank() || id == null || id <=0 || price == null || price <= 0)
			throw new IllegalArgumentException();
	}
}
