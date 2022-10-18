//import abstr.*;
class vignesh
{
public void name(String name)
{
	System.out.println("i am in 1");
}
}
class vicky extends vignesh
{
	public void name(String name)
	{
	System.out.println("i am in 2");
	}
	
}

public class checking1 
{
	public static void main(String[] args) 
	{
		
		vicky v=new vicky();
		v.name("a");
	vignesh v1=new vignesh();
	
		v1.name("b");
	}
}
