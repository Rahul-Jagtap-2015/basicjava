package LearnJavaPackage;

public class StringFunctions3
{
public static void main(String[] args)
{
	String a="Sarhad School Pune 46";
	
	System.out.println(a.replace('a','u'));
	
	System.out.println(a.replace("School","English School"));
	
	System.out.println(a.replaceAll("[0-9]", "*"));
	
	System.out.println(a.replaceAll("[a-z]",""));
	
	System.out.println(a.replaceAll("[A-Z]","@"));
	
	String rev="";
	
	for(int i=a.length()-1; i>=0; i--)
{
		char r=a.charAt(i);
		rev=rev+r;
}
	System.out.println("The reverse version is "+rev);
	
	
	//to check if given string is Palindrome use the below code
	
	if(rev.equals(a))
	{
		System.out.println("The input string is a palindrome");
	}
	else
	{
		System.out.println("The input string is not a palindrome");

	}
}
}
