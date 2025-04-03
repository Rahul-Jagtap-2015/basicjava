package LearnJavaPackage;

class ParentClass
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void multiply()
	{
		
	}
} 			//extends will relate the child class with parent class

public class Interitance_SLIProgram extends ParentClass
{
	static void sub(int c, int d)
	{
		System.out.println(c-d);
	}
	
	public static void main(String[] args)
{
	sub(75, 25);
	multiply(); //calling static method from parent class
	
	ParentClass a=new ParentClass();
	
		a.add(75, 25); //calling non static method from parent class
}
}