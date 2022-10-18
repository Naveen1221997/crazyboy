package polymor;

public class addof 
{public int addon(int a,int b)
	{
	return a+b;
	}
public int addon(int a,int b,int c)
{
	
return a+b+c;
}
public int addon(int a,int b,int c,int d)
{
return a+b+c+d;	
}
public static void main(String[] args) 
{
	addof a=new addof();
	System.out.println(a.addon(20, 20));
	System.out.println(a.addon(20, 20, 20));
	System.out.println(a.addon(20, 20, 20, 20));
	
}

}
