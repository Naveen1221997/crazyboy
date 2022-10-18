package constst;


public class company
{
	private String name;
	private String location;
	private int noofEmployee;
	private Employee employee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoaction() {
		return location;
	}
	public void setLoaction(String loaction) {
		this.location = loaction;
	}
	public int getNoofEmployee() {
		return noofEmployee;
	}
	public void setNoofEmployee(int noofEmployee) {
		this.noofEmployee = noofEmployee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public company(String name, String loaction, int noofEmployee, Employee employee) {
		
		this.name = name;
		this.location = loaction;
		this.noofEmployee = noofEmployee;
		this.employee = employee;
	}
	
	public String toString() {
		return "company [name=" + name + ", loaction=" + location + ", noofEmployee=" + noofEmployee + ", employee="
				+ employee + "]";
	}
	
	
	
}

