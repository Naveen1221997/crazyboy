package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


class mobile
{
private int rate;
private String Brand;
private boolean iswarranty;
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
}
public boolean getIswarranty() {
	return iswarranty;
}
public void setIswarranty(boolean iswarranty) {
	this.iswarranty = iswarranty;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
private String colour;
private String model;
public mobile(int rate, String brand, boolean iswarranty, String colour, String model) {
	super();
	this.rate = rate;
	Brand = brand;
	this.iswarranty = iswarranty;
	this.colour = colour;
	this.model = model;
}
@Override
public String toString() {
	return "mobile [rate=" + rate + ", Brand=" + Brand + ", iswarranty=" + iswarranty + ", colour=" + colour
			+ ", model=" + model + "]";
}
}




public class UseMobile {
	
		public static void main(String[] args) 
		{mobile m1=new mobile(12000,"VIVO",true,"RED","V5");
		mobile m2=new mobile(13000,"OPPO",false,"WHITE","V4");
		mobile m3=new mobile(14000,"NOKIA",true,"BLUE","V3");
		mobile m4=new mobile(15000,"LENEVO",true,"BLACK","V2");
		ArrayList<mobile> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		m.add(m4);
		//System.out.println(m);
		List <mobile> l=m.stream().filter(a->a.getRate()>140000)
				
				.toList();

		l.forEach(x->System.out.println(x));
		System.out.println("***************");
		List<mobile>l1=m.stream().filter(a->a.getColour()=="RED").toList();
		l1.forEach(x->System.out.println(x));
		System.out.println("***************");
		List<mobile>l2=m.stream().filter(a->a.getIswarranty()==false).toList();
		l2.forEach(x->System.out.println(x));
		System.out.println("******************");
		
		m.stream().filter(a->a.getBrand().contains("V")).forEach(a->System.out.println(a));
		System.out.println("*********");
		m.stream().filter(a->a.getColour()=="BLUE").forEach(x->System.out.println(x));
		System.out.println("****************");
		Map<String,mobile> m5=m.stream().filter(x->x.getModel().equals("V3")).collect(Collectors.toMap(mobile::getBrand,Function.identity()));
		m5.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println("****************************");
		Map<Boolean,mobile> m6=m.stream().filter(a->a.getBrand().equals("V2")).collect(Collectors.toMap(mobile::getIswarranty,Function.identity()));
		m6.forEach((k,v)->System.out.println(k+" "+v));
		System.out.println();
		}


}
