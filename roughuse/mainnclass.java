package roughuse;
public abstract class mainnclass 
{public static void main(String[] args) {
	Water w=new Water();
	w.setColour("Colourless");
	w.setDensity(10);
	
	jug j=new jug();
	j.setName("tapper");
	j.setLength(5);
	j.setWater(w);
	
	System.out.println(w.getColour());
	System.out.println(w.getDensity());
	System.out.println(j.getName());
	System.out.println(j.getLength());
	System.out.println(j.getwater().getColour());
	System.out.println(j.getwater().getDensity());
	}

}
