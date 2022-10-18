package inherit;

public class engineeringStudent extends collegeStudent

{
	
	private String dept;
	private int semester;
	private int arrears;
	private int passedout;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getArrears() {
		return arrears;
	}
	public void setArrears(int arrears) {
		this.arrears = arrears;
	}
	public int getPassedout() {
		return passedout;
	}
	public void setPassedout(int passedout) {
		this.passedout = passedout;
	}
	public engineeringStudent(String name, int age, int rollno, String collegename, boolean isuniform, String dept,
			int semester, int arrears, int passedout) {
		super(name, age, rollno, collegename, isuniform);
		this.dept = dept;
		this.semester = semester;
		this.arrears = arrears;
		this.passedout = passedout;
	}
	public String toString()
	{
		return super.toString()+" "+super.toString()+" "+dept+" "+arrears+" "+passedout;
	}
	

}
