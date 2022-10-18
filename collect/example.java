package collect;

//import java.util.ArrayList;
import java.util.HashMap;

public class example 
{public static void main(String[] args) 
{HashMap<Integer,String> a=new HashMap<>();
a.put(250, "Aaveen");
a.put(500, "praveen");
a.put(750, "prasanth");
//System.out.println(a);
for(int i=0;i<a.size();i++)
{if(a.equals(250)) {
System.out.println(a.get(i));	
}
}
	
}

}
