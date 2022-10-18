package roughuse;

public class car 
{private String brand;
private String color;
int price;
String model;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public car(int price, String model) {
	super();
	this.price = price;
	this.model = model;
}
@Override
public String toString() {
	return "car [price=" + price + ", model=" + model + "]";
}


}
