package methovr;

public class bank
{public int loan(String name)
	{
	return 50000;
	}
public int loan(String name,int sal)
{
return 50000+sal;	
}
public int loan(String name,int sal,int nop)
{
return 50000+sal*nop;	
}
public static void main(String[] args) {
	bank b=new bank();
	System.out.println(b.loan("m"));
	System.out.println(b.loan("m", 50000));
	System.out.println(b.loan("m", 50000,2));
}
}
