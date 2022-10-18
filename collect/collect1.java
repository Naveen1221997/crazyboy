package collect;

import java.util.ArrayList;

public class collect1
{
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add(28);
		a.add(26);
		a.add(27);
		a.add(25);
		a.add(26);
		a.add(26);
		a.add(24);
		a.add(27);
		a.add(27);
		a.add(26);
		a.remove(3);
		a.set(0, 30);
		for(Object o:a)
		{
			System.out.println(o);
		}
		
	}

}
