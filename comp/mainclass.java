package comp;

public class mainclass 
{
	public static void main(String[] args) {
		Computer c1=new Computer();
		c1.setName("lenovo");
		c1.setNoofkeys(105);
		//c1.setMouse(m1);
		mouse m1=new mouse();
		m1.setKeys(3);
		m1.setName("wireless mouse");
		keyboard k= new keyboard();
		k.setNoofkeys(94);
		k.setFirstkey("Esc");
		System.out.println("brand = "+c1.getName());
		System.out.println("computer keys = "+c1.getNoofkeys());
		System.out.println("Mouse keys = "+m1.getKeys());
		System.out.println("Type of mouse = "+m1.getName());
		System.out.println("Keyboard first key = "+k.getFirstkey());
		System.out.println("keyboard keys = "+k.getNoofkeys());
	}

}
