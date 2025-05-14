package LearnJavaPackage;

import java.util.Scanner;

public class SDET_PrimeNumberCheck
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Please Enter the Number to Check if Prime or Not");
	
	int num=s.nextInt();
		
	boolean isPrime=true;
	
	for(int i=2;i<=Math.sqrt(num);)
	{
		if(num%i==0)
		{
			isPrime=false;
		}
	break;
}
	System.out.println(isPrime);
	
	s.close();
}
}
