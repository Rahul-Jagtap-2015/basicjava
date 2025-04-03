package LearnJavaPackage;

public class NonStaticMethod
{
	void multiply()
	
	{
		int a=20;
		int b=15;
		System.out.println(a*b);
	}
	
	void add()
	
	{
		int a=50;
		int b=75;
		System.out.println(a+b);
	}
	
	void sub()
	
	{
		int a=175;
		int b=20;
		System.out.println(a-b);
	}
	
	public static void main(String[] args) 
{

		NonStaticMethod n=new NonStaticMethod();   //object creation
		n.multiply();   //variable to call NonStaticMethod
		n.add(); 		//same variable can be used to call number of NonStaticMethods in a program
		n.sub();
}
}