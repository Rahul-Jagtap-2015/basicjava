package LearnJavaPackage;

import java.util.Scanner;

//Find out the average of all the numbers present in your array

public class AverageSumofArray
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	double sum=0;
	double average=0;
	
	System.out.println("Please enter the size of your array");
	double [] array=new double[s1.nextInt()];
	
	for (int i=0;i<=array.length-1;i++)
	{
		System.out.println("Please enter the value for index position " +i);
		array[i] = s1.nextDouble();
		sum=sum+array[i];
	}
		System.out.println("SUM of values given in Array is "+sum);
		
		average=sum/array.length;
	
		System.out.println("AVERAGE of the given Array is "+average);
		
		s1.close();
	
}
}
