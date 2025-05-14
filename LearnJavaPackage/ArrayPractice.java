package LearnJavaPackage;

import java.util.Scanner;

public class ArrayPractice
{
public static void main(String[] args)
{
	int [] a= {23,40,45,30,25,70,60,50};

	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the number you want to search");
	
	boolean k=false;
	
	int input=s.nextInt();
	
	for(int i=0;i<=a.length-1;i++)
	{
		if (input==a[i])
	{
		k=true;
	}
	}
	if(k==true)
	{
		System.out.println("Element is found");
	}
	else
	{
		System.out.println("Element not found");
	}
	s.close();
	
}
}
