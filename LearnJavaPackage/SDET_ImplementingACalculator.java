package LearnJavaPackage;

import java.util.Scanner;

public class SDET_ImplementingACalculator
{
@SuppressWarnings("resource")
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Enter the first number");
		double num1=s1.nextDouble();
	System.out.println("Enter the second number");
		double num2=s1.nextDouble();
	System.out.println("Enter the operation(+,-,*,/):");	
	
	char operation=s1.next().charAt(0);
	
	double result;
	
	switch (operation)
	{
	case '+':result=num1+num2;break;
	case '-':result=num1-num2;break;
	case '*':result=num1*num2;break;
	case '/':result=num1/num2;break;
	
	default:throw new IllegalArgumentException("Invalid Operation");
		}
	System.out.println("Result: " + result);
	
	s1.close();
}
}
