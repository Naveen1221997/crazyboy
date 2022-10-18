package maping;

import java.util.HashMap;
import java.util.Iterator;

public class hash {
	public static void main(String[] args) 
	{
		HashMap<Integer,String> a=new HashMap<>();
	a.put(250, "Aaveen");
	a.put(500, "praveen");
	a.put(750, "prasanth");
	System.out.println(a);
	int max=0;
	int min=0;
	
	for(Integer i:a.keySet()) {
	String str=a.get(i);
	System.out.println(i+"-----"+str);
	}
	a.forEach((key,value)->{
		System.out.println(key+"---->"+value);
	});
	System.out.println("ssssssssss");
	a.forEach((k,v)->{
		System.out.println(k);
	});
	System.out.println("ssssssssss");
	a.forEach((k,v)->{
		System.out.println(v);
	});
	a.keySet().forEach(b->{
		System.out.println(b);
	});
	a.values().forEach((c)->{
		System.out.println(c);
	});
	//ITERATOR
		Iterator<Integer> b=a.keySet().iterator();
	while(b.hasNext())
	{
		System.out.println(b.next());
	}
	Iterator<String> c=a.values().iterator();
	while(c.hasNext())
	{
		System.out.println(c.next());
	}
	//to remove the values
	System.out.println("-----------");
	Iterator<String> i1=a.values().iterator();
	while(i1.hasNext()) {
		if(i1.next().startsWith("A"))
		{
			i1.remove();
		}
	}
	a.values().forEach(x->System.out.println(x));
	System.out.println("-----------");
	
	
	for(Integer i:a.keySet())
	{
		if(i<min) {
			min=i;
		System.out.println("min"+min);
	}}
	for(String s:a.values())
	{
		System.out.println(s);
		
	}
	}}

