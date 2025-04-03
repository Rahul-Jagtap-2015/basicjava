package LearnJavaPackage;

public class ArithmaticOperations
{
	static void add()
	{
	int a=100;
	int b=200;
	int c=a+b;

	System.out.println(c);
	}
	
	static void multi()
	{
	int a=10;
	int b=20;
	int c=a*b;

	System.out.println(c);
	}
	
	static void sub()
	{
	int a=100;
	int b=200;
	int c=b-a;

	System.out.println(c);
	}
	
	static void div()
	{
	int a=10;
	int b=400;
	int c=b/a;

	System.out.println(c);
	}
	
	static void mod()
	{
	int a=124;
	int b=5;
	int c=a%b;

	System.out.println(c);
	}
	
public static void main(String[] args)

{
	mod();
	add();
	multi();
	sub();
	div();
}
}
