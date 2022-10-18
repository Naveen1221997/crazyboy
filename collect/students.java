
package collect;

import java.util.ArrayList;

public class students 
{
	private String name;
	private String gender;
	private int fees;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void fees(int fees)
	{
		this.fees=fees;
	}
	public String getName()
	{
		return name;
	}
	public int getFees() {
		return fees;
	}
	public String getGender() {
		return gender;
	}
	public students(String name,String gender,int fees)
	{
		this.name=name;
		this.gender=gender;
		this.fees=fees;
	}
	public String toString() {
		return "name=" + name + ", gender=" + gender + ", fees=" + fees ;
	}

}
