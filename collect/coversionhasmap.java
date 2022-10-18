package collect;

import java.util.ArrayList;
import java.util.HashMap;

class student
{
String  name;
int id;
int height;

student(String name,int id,int height)
{
this.name=name;
this.id=id;
this.height=height;
}
public String toString()
{
return name+" "+id+" "+height;	
}
}
public class coversionhasmap
{
	public static void main(String[] args) 
	{
	ArrayList<student> s =new ArrayList();	
	s.add(new student("naveen", 12, 5));
	s.add(new student("praveen", 34, 4));
	s.add(new student("siva", 45, 3));
	//HashMap<Integer> hm=new HashMap();
	
	}
	

}
