
public class students 
{
	private String name;
	private int  id;
	private String branch;
	private int marks;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getBranch() {
		return branch;
	}
	public int getMarks() {
		return marks;
	}
	students(String name,int id,String branch,int mark)
	{
		this.name=name;
		this.id=id;this.branch=branch;this.marks=marks;
	}
	public String toString()
	{return name+" "+id+" "+branch+" "+marks;}
}
