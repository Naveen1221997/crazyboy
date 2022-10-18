package constst;

public class mainclass 
{
	public static void main(String[] args) {
		
	
	Processor p=new Processor("intel", 8, "i11");
	lap l= new lap("LENOVO", 80000, true, p);
	System.out.println(l);

}
}