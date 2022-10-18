package roughuse;

public class usecar {
	public static void main(String[] args)
	{
		car c= new car(200000, "bmweng");
		c.setBrand("BMW");
		c.setColor("Red");
		System.out.println("Model: "+c.getBrand()+" Price: "+c.getColor());
		System.out.println(c.model);
		System.out.println(c.price);
		
		
	}

}
