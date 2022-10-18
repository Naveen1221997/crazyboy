package collect;

import java.util.ArrayList;

public class rough 
{
	String name;
	String colour;
	int rate;
	int size;
	rough(String name,String colour,int rate,int size){
		this.name=name;
		this.colour=colour;
		this.rate=rate;
		this.size=size;
	}
	public String toString()
	{
		return name+" "+colour+" "+rate+" "+size;
	}

}
