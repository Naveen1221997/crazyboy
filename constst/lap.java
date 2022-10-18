package constst;

public class lap 
{
private String brand;

private int price;
private boolean istouchscreen;
private Processor processor;
public lap(String brand, int price, boolean istouchscreen, Processor processor) {
	super();
	this.brand = brand;
	this.price = price;
	this.istouchscreen = istouchscreen;
	this.processor = processor;
}
public String toString() {
	return "lap [brand=" + brand + ", price=" + price + ", istouchscreen=" + istouchscreen + ", processor=" + processor
			+ "]";
}

}
