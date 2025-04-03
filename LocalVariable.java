package LearnJavaPackage;

public class LocalVariable
{
	static void add()
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
	}
	void sub()
	{
		int a=10;
		int b=20;		
		
		System.out.println(b-a);
	}
	
	public static void main(String[] args)
	
{
		add();
		
		LocalVariable s1=new LocalVariable();
		
		s1.sub();

	}

}
