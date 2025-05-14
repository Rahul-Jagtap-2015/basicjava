package LearnJavaPackage;

public class SDET_ReverseString
{
public static void main(String[] args)
{
	String str="Automation";
	
	StringBuilder reverse=new StringBuilder(str).reverse();
	
	System.out.println(reverse);
}
}
