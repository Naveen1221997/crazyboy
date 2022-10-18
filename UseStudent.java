import java.util.HashMap;
import java.util.Iterator;

public class UseStudent 
{
	public static void main(String[] args) 
	{
		students s=new students("kaithi", 123, "ECE", 70);
		students s1=new students("karti", 8765, "Ece", 80);
		students s2=new students("rolex", 12345, "ece", 85);
		students s3=new students("ramp", 564, "Ece", 90);
		students s4=new students("woody", 1236, "ECE", 95);
		HashMap<Integer,students> b=new HashMap();
		b.put(s.getId(), s);
		b.put(s1.getId(), s1);
		b.put(s2.getId(), s2);
		b.put(s3.getId(), s3);
		b.put(s4.getId(), s4);
		System.out.println(b);
		System.out.println("-----------");
		Iterator<students> c=b.values().iterator();
		{
			while(c.hasNext())
			{
				System.out.println(c.next());
			}
		}
		
		
	}

}
