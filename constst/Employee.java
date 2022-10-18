package constst;

public class Employee 
{
	private String name;
	private int salary;
	private int id;
	private String dept;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String name, int salary, int id, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.dept = dept;
	}
	
	public String toString()
	{
		return "Employee[Name = "+ name +" Salary = "+salary+" id = "+ id +" Dept = "+dept+"]";
	}

}
