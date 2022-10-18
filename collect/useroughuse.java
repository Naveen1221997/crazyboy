package collect;

import java.util.ArrayList;

public class useroughuse 
{
	public static void main(String[] args) {
		
	rough r=new rough("naveen","red",1200,32);	
	rough r1=new rough("praveen","black",1200,34);
	rough r2=new rough("ganesh","green",1200,36);
	rough r3=new rough("ramesh","brown",1200,38);
	ArrayList<rough> words=new ArrayList();
	words.add(r);
	words.add(r1);
	words.add(r2);
	words.add(r3);
	for(int i=0;i<=words.size();i++)
	{
		System.out.println(words.get(i));
	}
	
	/*for(rough o:a)
	
	{
		if(o.name.length()>6)
		System.out.println(o.colour+" "+o.rate+" "+o.size);
	}*/
	}

}
