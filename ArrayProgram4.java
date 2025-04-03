package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//copy input array into output array in reverse order

public class ArrayProgram4
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please enter the length of Array");
	
	int [] input = new int [s1.nextInt()];
	
	int[] output = new int[input.length];
	
	for (int i=0,j=input.length-1;i<=input.length-1;i++,j--)
	{
		System.out.println("Please enter the value for index =>"+i);
		
		input[i]=s1.nextInt();
		
		output [j]=input [i]; 
	}
	
	System.out.println("Input Array "+ Arrays.toString(input));
	
	System.out.println("Output Array "+ Arrays.toString(output));
	
	s1.close();
}
}
