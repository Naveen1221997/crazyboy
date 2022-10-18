package constst;

public class Processor {
	
	
	private String brand;
	private int core;
	private String generation;
	public Processor(String brand, int core, String generation) {
		super();
		this.brand = brand;
		this.core = core;
		this.generation = generation;
	}
	public String toString() {
		return "Processor [brand=" + brand + ", core=" + core + ", generation=" + generation + "]";
	}

}
