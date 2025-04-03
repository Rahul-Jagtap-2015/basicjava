package LearnJavaPackage;

public class This1
{
	This1()
	{
		this(54546454546l);
		System.out.println("1st Constructor");
	}
	This1(char a)
	{
		this(45.5);
		System.out.println("2nd Constructor");
	}
	This1(double a)
	{
		System.out.println("3rd Constructor");
	}
	This1(long a)
	{
		this('R');
		System.out.println("4th Constructor");
	}
public static void main(String[] args)
{
	new This1();
}

}
