package roughuse;

public class test 
{
public static void main(String[] args) {
	String s1="ABCTabc12345";
	//"this is naveen from salem"
	test t=new test();
	t.naveen(s1);
	
}
public void naveen(String s1)
{int UPPERcount=0;
int smallcount=0;
int numcount=0;

for(int i=0;i<s1.length();i++)
{if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
{
	UPPERcount++;
}
}System.out.println(UPPERcount);

for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
	
	smallcount++;
}	
}System.out.println(smallcount);
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)>'0' && s1.charAt(i)<='9')
{
	numcount++;
	
}
}
System.out.println(numcount);
}
}