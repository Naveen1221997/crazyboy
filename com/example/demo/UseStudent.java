package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s=new Student("k",100,"e",true);
		Student s1=new Student("Kavin", 200,"EEE",false);
		Student s2=new Student("kalai",300,"ECE",true);
		ArrayList<Student>li=new ArrayList<>();
		li.add(s);
		li.add(s1);
		li.add(s2);
		List<Student>l=li.stream().filter(a->a.getIsgood()==true).collect(Collectors.toList());
		l.forEach(x->System.out.println(x));
	}

}
