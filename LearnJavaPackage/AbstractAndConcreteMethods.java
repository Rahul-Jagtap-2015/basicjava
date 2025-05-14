package LearnJavaPackage;
abstract class Company1
{
	abstract void Method1();
	
	void Method2()
	{
		System.out.println("Concrete Method 2 in Company1");
	}
}
abstract class Company2 extends Company1
{
	abstract void Method3();
	
	void Method4()
	{
		System.out.println("Concrete method 4 in Company2");
	}
}
public class AbstractAndConcreteMethods extends Company2
{
	void Method3()
	{
		System.out.println("Company1 cannot see this implementation in Method3 in Company2");
	}

	void Method1()
	{
		System.out.println("Company2 cannot see this implementation in Method1 in Company1");
	}
public static void main(String[] args)
{
	AbstractAndConcreteMethods c1=new AbstractAndConcreteMethods();
	
	c1.Method1();
	c1.Method2();
	c1.Method3();
	c1.Method4();
	
	System.out.println("Child Class");
}
}