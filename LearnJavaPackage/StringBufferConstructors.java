package LearnJavaPackage;

public class StringBufferConstructors
{
public static void main(String[] args)
{
	StringBuffer sb1=new StringBuffer();
	
	System.out.println("Non-Parameterized Constructor "+sb1.append("Hello"));
	
	StringBuffer sb2=new StringBuffer("Rahul");
	
	System.out.println("Parameterized Constructor "+sb2);
	
	StringBuffer sb3=new StringBuffer(100);
	
	System.out.println("Capacity is "+sb3.capacity());
	
	System.out.println(sb2.replace(2, 3, "Amit"));
}
}
