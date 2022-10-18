package maping;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomerdetails 
{
	public static void main(String[] args) {
		Customerdetails c=new Customerdetails("raja",25, "raju@", 15000, 152346879);
		Customerdetails c1=new Customerdetails("pooja",25, "pooja", 5000, 146879);
		Customerdetails c2=new Customerdetails("kaaja",25, "kaja@", 215000, 15879);
		Customerdetails c3=new Customerdetails("theja",25, "theja@", 415000, 152349);
		HashMap <Integer,Customerdetails> a=new HashMap();
		a.put(1, c);
		a.put(2, c1);
		a.put(3, c2);
		a.put(4, c3);
		System.out.println(a);
		System.out.println("---------------------------");
		for(Integer s1:a.keySet())
		{
			System.out.println(s1);
			
		}
		for(Customerdetails s:a.values())
		{
			System.out.println(s);
		}
		System.out.println("------------------");
		System.out.println("**********************************************");
		Iterator<Customerdetails> i=a.values().iterator();
		while(i.hasNext())
		{
		i.next();
		}a.values().forEach((x->{System.out.println(x);}));
		
		
	}

}
