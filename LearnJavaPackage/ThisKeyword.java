package LearnJavaPackage;

public class ThisKeyword
{
	ThisKeyword() //non-parameterized
	{
		this(54546454546l); //this will call 4th constructor
		System.out.println("1st Constructor");
	}
	ThisKeyword(char a)
	{
		this(45.5); //this will call 3rd constructor
		System.out.println("2nd Constructor");
	}
	ThisKeyword(double a)
	{
		System.out.println("3rd Constructor");
	}
	ThisKeyword(long a)
	{
		this('R'); //this will call 2nd constructor
		System.out.println("4th Constructor");
	}
public static void main(String[] args)
{
	new ThisKeyword(); //non-parameterized
}

}
