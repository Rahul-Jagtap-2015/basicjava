package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//to accept the values of index positions for your array at run time

public class ArrayProgram2 
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please enter the size of the Array");
	
	int rollno[] = new int[s1.nextInt()];
	
	for(int i=0;i<=rollno.length-1;i++)
{
		System.out.println("Please enter the value for index =>"+i);
		
		rollno[i]=s1.nextInt();
		
}
	System.out.println(Arrays.toString(rollno));
	
	s1.close();
	
}
}
