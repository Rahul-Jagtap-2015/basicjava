package LearnJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

//to accept the values of your array at run time

public class ArrayProgram1
{
	public static void main(String[] args)
{
	int rollno[] = new int[5];
	
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please enter the roll nos of any 5 students");
	
	for(int i=0;i<=4;i++)
	{
		rollno[i] = s1.nextInt();
	}
	System.out.println(Arrays.toString(rollno));
	
	Arrays.sort(rollno);
	
	System.out.println("After Sorting"+ Arrays.toString(rollno));
	
	s1.close();	
}
}
