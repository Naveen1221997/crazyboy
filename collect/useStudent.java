package collect;

import java.util.ArrayList;

public class useStudent
{
	public static void main(String[] args) {
		Student s=new student("a","Male",50000,true);
		student s1=new student("b","Male",50000,false);
		student s2=new student("c","Male",50000,true);
		student s3=new student("d","Male",50000,true);
		student s4=new stu dent("e","Female",50000,false);
		student s5=new student("f","Male",50000,false);
		student s6=new student("g","Male",50000,true);
		student s7=new student("h","Male",50000,true);
		student s8=new student("i","Male",50000,true);
		student s9=new student("j","Male",50000,true);
		student s10=new student("k","Male",50000,false);
	ArrayList<student> a=new ArrayList();
	a.add(s);
	a.add(s1);
	a.add(s2);
	a.add(s3);
	a.add(s4);
	a.add(s5);
	a.add(s6);
	a.add(s7);
	a.add(s8);
	a.add(s9);
	a.add(s10);
	
	a.forEach(x -> {
		if(x.getName().equals("a"))
	{
			System.out.println(x.getName());
	}
	});
	
	System.out.println("*****************");
	
	for(int i=0;i<a.size();i++) 
	{
		System.out.println(a.get(i).getName().toUpperCase());
		
	}
	a.forEach(x->{
		if(x.getGender().equals("Male"))
		{System.out.println(x.getGender());
		System.out.println(x.getName());
		
	}});
	
	}
}
