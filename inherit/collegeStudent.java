package inherit;

public class collegeStudent extends Student
{
	private String collegename;

	private boolean isuniform;
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	
	public boolean isIsuniform() {
		return isuniform;
	}
	public void setIsuniform(boolean isuniform) {
		this.isuniform = isuniform;
	}
	public collegeStudent(String name, int age, int rollno, String collegename, boolean isuniform) {
		super(name, age, rollno);
		this.collegename = collegename;
		
		this.isuniform = isuniform;
	}
	
	public String toString() {
		return super.toString()+" "+collegename+" "+isuniform;
	}
	

}
