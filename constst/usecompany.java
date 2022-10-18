package constst;

public class usecompany
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("kartick", 50000, 1234, "info tech");
		System.out.println(e1);
		company c1=new company("TCS", "SIPCOT", 7, e1);
		System.out.println(c1);
		
	}

}
