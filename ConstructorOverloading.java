package LearnJavaPackage;

public class ConstructorOverloading
{
	ConstructorOverloading(int a)
	{
		System.out.println("First Constructor");
	}
	ConstructorOverloading(double a)
	{
		System.out.println("Second Constructor");
	}
	ConstructorOverloading(char a)
	{
		System.out.println("Third Constructor");
	}
	ConstructorOverloading(int a, double b)
	{
		System.out.println("Fourth  Constructor");
	}

	public static void main(String[] args)
{
		new ConstructorOverloading(10);
		new ConstructorOverloading(3.14);
		new ConstructorOverloading('M');
		new ConstructorOverloading(25, 10.5);
}

}
