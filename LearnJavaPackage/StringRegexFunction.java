package LearnJavaPackage;

import java.util.Scanner;

public class StringRegexFunction
{
public static void main(String[] args)
{
	Scanner s1=new Scanner (System.in);
	
	System.out.println("Please enter the string");
	
	String input=s1.next();
	
	//check if the given string has 'man' written in it
	//using string.regex function
	
	boolean b1=input.matches("(.*)man(.*)");
	
	if(b1)
	{
		System.out.println("Given String have 'man' in it");
	}
	else
	{
		System.out.println("Given String does not have 'man' in it");
	}
	s1.close();
	
}
}
