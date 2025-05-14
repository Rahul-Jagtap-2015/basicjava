package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//to copy one array into another array

public class InputOutputArray1
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please enter the length of Array");
	
	boolean [] answer=new boolean[s1.nextInt()];
	
	for (int i=0;i<=answer.length-1;i++)
	{
		answer[i]=s1.nextBoolean();
	}
	System.out.println("Input Array "+ Arrays.toString(answer));
	
	boolean [] answer1=new boolean[answer.length];
	
	for (int i1=0;i1<=answer1.length-1;i1++)
	{
		answer1[i1]=answer[i1]; 
	}
	
	System.out.println("Output Array "+ Arrays.toString(answer1));
	
	s1.close();

}
}