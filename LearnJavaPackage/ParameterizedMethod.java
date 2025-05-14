package LearnJavaPackage;

public class ParameterizedMethod 
{
	void add(int a, int b)
	{
		System.out.println(a+b);
}

	void sub(int a, int b)
	{
		System.out.println(a-b);
}
	
	static void mult()
	{
		int a=20;
		int b=15;
		
		System.out.println(a*b);
}
	
	static void div(int a, int b)
	{
		
		System.out.println(a/b);
	}

	public static void main(String[] args) 
{
	ParameterizedMethod a=new ParameterizedMethod();
	a.add(45, 55);
	a.sub(90, 45);

	mult();
	div(750, 25);				
}
}
