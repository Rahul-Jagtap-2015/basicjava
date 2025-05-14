package LearnJavaPackage;
class Super4
{
	Super4()
	{
		this("Sun");
		System.out.println("I'm 3rd Parent Class");
	}
	Super4(String s)
	{
		System.out.println("I'm 4th Parent Class");
	}
}
class Super3 extends Super4
{
	Super3()
	{
		System.out.println("I'm 2nd Parent Class");
	}
}
class Super2 extends Super3
{
	Super2(int a)
	{
		System.out.println("I'm 1st Parent Class");
	}
}
public class Super1 extends Super2
{
	Super1()
	{
		super(40);
		System.out.println("I'm Child Class");
	}
public static void main(String[] args)
{
	new Super1();
}
}
