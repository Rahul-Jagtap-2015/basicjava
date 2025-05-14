package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//to check if the 2 strings are ANAGRAM

public class ANAGRAM
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter the First String");
	String a=s1.next();
	System.out.println("Enter the Second String");
	String b=s1.next();
	
	if(a.length()!=b.length())
	{
		System.out.println("String Length is not same");
	}
	else
	{
		char [] a1=a.toCharArray();
		char [] b1=b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
		
	if(Arrays.equals(a1, b1))
	{
	System.out.println("Given Strings are ANAGRAM");
	}
	else
	{
		System.out.println("Given Strings are NOT ANAGRAM");
	}
	s1.close();
}
}
}
