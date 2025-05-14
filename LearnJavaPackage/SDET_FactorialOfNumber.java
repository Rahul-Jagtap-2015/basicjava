package LearnJavaPackage;

import java.util.Scanner;

public class SDET_FactorialOfNumber
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Please Enter the Number to Find The Factor");
	
	int num=s.nextInt(),factorial=1;
	
	for(int i=1;i<=num;i++)
	{
		factorial*=i;
	}
	System.out.println(factorial);
	
	s.close();
}
}
