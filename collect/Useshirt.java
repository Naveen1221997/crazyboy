package collect;

import java.util.ArrayList;

public class Useshirt
{
	public static void main(String[] args)
	{
		shirt s=new shirt("Allen",3000,true,"male");
		shirt s1=new shirt("sollen",5000,false,"male");
		shirt s2=new shirt("sip",4000,true,"female");
		shirt s3=new shirt("sol",2000,true,"female");
		shirt s4=new shirt("stolen",1000,true,"male");
		ArrayList a=new ArrayList();
		a.add(s);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		//for(int i=0;i<a.size();i++)
		//{if()
			
		}
		
		
		//System.out.println(a.size());
		//System.out.println(a.contains(s3));
		/*
		for(shirt d:a)
		{
			if(d.getBrand().equals("sollen"))
			{
				System.out.println(d);
			}
		}
		a.forEach(x->
		{
			if()
		}
		System.out.println(x));
		//ArrayList<shirt> b=new ArrayList();
		/*for(shirt x:b)
		{
			if(x.getGender()=="male")
			{
				System.out.println(x);
			}
			
		}
				
		
		
		ArrayList<shirt> checkedshirt=new ArrayList ();
		for(shirt d:a) {
			if(d.getBrand()=="sol") {
				checkedshirt.add(d);
			}
		}
		
		checkedshirt.forEach(c->System.out.println(c));
		
		/*ArrayList<shirt> gender=new ArrayList();
		for(shirt f:a) {
			if(f.getGender()=="male"){
				gender.add(f);
			}
		}
		gender.forEach(c->System.out.println(c));*/
		
		
		
		
		
	
}
