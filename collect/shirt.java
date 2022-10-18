package collect;

public class shirt 
{
	private String brand;
	private String gender;
	private int price;
	private boolean isChecked;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getisChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	public shirt(String brand, int price, boolean isChecked,String gender) {
		this.brand = brand;
		this.price = price;
		this.isChecked = isChecked;
		this.gender=gender;
	}
	
	public String toString() {
		return brand +" "+ price + " " + isChecked+" "+gender ;
	}

}
