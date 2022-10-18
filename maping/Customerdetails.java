package maping;

public class Customerdetails 
{
private String name;private int age;private String email;private int accbal;private int aadharno;
public void setName(String name)
{
this.name=name;	
}public void setAge(int age) {
	this.age=age;
}public void setEmail(String email)
{
this.email=email;
}
public void setAccbal(int accbal)
{
this.accbal=accbal;	
}public void setAadharno(int aadharno) {
	this.aadharno=aadharno;
}
public int getAge()
{return age;}
public String getEmail()
{return email;}
public int getAccbal()
{return accbal;}
public int getAadharno()
{return aadharno;}
Customerdetails(String name,int age,String email,int accbal,int aadharno )
{
this.name=name;
this.age=age;
this.email=email;
this.accbal=accbal;
this.aadharno=aadharno;
}
@Override
public String toString() {
	return " name=" + name + ", age=" + age + ", email=" + email + ", accbal=" + accbal + ", aadharno="
			+ aadharno  ;
}



}
