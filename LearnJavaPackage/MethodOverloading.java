package LearnJavaPackage;

public class MethodOverloading
{
	static void Method1(int a, int b)
	{
		System.out.println("Method 1 is called successfully");	
	}
	void Method2(double a, double b)
	{
		System.out.println("Method 2 is called successfully");	
	}
	static void Method3(char a, char b)
	{
		System.out.println("Method 3 is called successfully");	
	}
	void Method4(long a, long b)
	{
		System.out.println("Method 4 is called successfully");	
	}
	static void Method5(boolean a, boolean b)
	{
		System.out.println("Method 5 is called successfully");	
	}
	void Method6(int a, int b)
	{
		System.out.println("Method 6 is called successfully");	
	}	

	public static void main(String[] args)
{
	Method1(400,500);
	MethodOverloading m2=new MethodOverloading();
	m2.Method2(Math.PI, Math.PI);
	Method3('M', 'F');
	m2.Method4(123456789, 987654321);
	Method5(true, false);
	m2.Method6(123, 456);

}
}
