package roughuse;
interface Bank
{
public String rateofintrest(int amount);
}
class iob implements Bank
{
	public String rateofintrest(int amount)
	{
		return "Intrest ="+amount*15/100;
	}
	}

 public class Usebank
{
	
	 public static void main(String[] args) {
		iob b=new iob();
		System.out.println(b.rateofintrest(10000));
		
	
 } }
