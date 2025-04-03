package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//to check if 2 arrays are equal to each other at run time

public class ArrayProgram5
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);

	System.out.println("Please enter the size of Array");
	
	int [] a1=new int[s1.nextInt()];
	
	int[] a2= new int[a1.length];
	
	for (int i=0;i<=a1.length-1;i++)
	{
		System.out.println("Please enter the value of Array 1 at index " +i);
				a1[i]= s1.nextInt();
		System.out.println("Please enter the value of Array 2 at index " +i);
				a2[i]= s1.nextInt();
	}	
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
	boolean b1=Arrays.equals(a1, a2);
	
	if(b1==true)
	{
		System.out.println("Array 1 is equal to Array 2");
	}
		else
	{
		System.out.println("Array 1 is not equal to Array 2");
	}
	
	s1.close();
}
}
