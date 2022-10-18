package collect;

import java.util.ArrayList;
import java.util.Arrays;

public class FindName {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(Arrays.asList("Yamaha", "cbr","prakash"));

		a.add("revanth");
		a.add("saravanan");
		a.add("kishore");
		a.add("shoba");
		a.add("naveen");
		a.add("arul");
		a.add("venkat");
		a.add("vigneh");
		a.add("rajaram");
		a.remove("naveen");
		// for each method
		for (Object o : a) {
			 {
			System.out.println(o);}
		}
		//a.forEach(x -> System.out.println(x));

	}

}
