package basics.annotations;

public class Tyre {
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	private String brand;
	public Tyre() {}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String toString()
	{
		return "tyre brand = "+brand;
	}
	

}
