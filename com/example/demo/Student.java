package com.example.demo;

public class Student {
private String name;
private int marks;
private String branch;
private boolean isgood;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + ", branch=" + branch + ",isgood="+isgood+"]";
}
public boolean getIsgood() {
	return isgood;
}
public void setIsgood(boolean isgood) {
	this.isgood = isgood;
}
Student(String name, int marks, String branch,boolean isgood) {
	this.name = name;
	this.marks = marks;
	this.branch = branch;
	this.isgood=isgood;
}

}
