package LearnJavaPackage;

public class SDET_CheckForPalindrome
{
public static void main(String[] args)
{
	String str="malayalam";
	
	String reversed=new StringBuilder(str).reverse().toString();
	
	System.out.println(str.equals(reversed));
}
}
