abstract class worker
{
	String name="karthick"; 
	int id=1234;
	int salperhour=100;
	int workinghours=12;
	String getjob="testing";
	
public String name(String name)
{
	return name;
	}
abstract public String getjob(String getjob);
abstract public int calculateperday(int salperhour,int workinghours);
}
class coder extends worker
{
public String getjob(String getjob)
{
	//this.getjob=getjob;
return getjob;	
}
public int calculateperday(int salperhour,int workinghours)
{
return salperhour*workinghours;	
}
}


public class mainclass1
{
	public static void main(String[] args) 
	{
		coder c=new coder();
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.salperhour);
		System.out.println(c.workinghours);
		//System.out.println(c.job);
		System.out.println(c.getjob(c.getjob));
		System.out.println(c.calculateperday(c.salperhour,c.workinghours));
	}

}
