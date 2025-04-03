package LearnJavaPackage;

public class StaticNonStaticGlobalVariable
{
	static int a=10;
	static int b=20;

	static void add()
{
		System.out.println(a+b);
}
	void subtract()
{
		System.out.println(a-b);
}
	static void multiply()
{
		System.out.println(a*b);
}
	void divide()
{
		System.out.println(b/a);
}
	
	public static void main(String[] args)
{
		StaticNonStaticGlobalVariable a1=new StaticNonStaticGlobalVariable();
		
	add();
	a1.subtract();
	multiply();
	a1.divide();
	
}

}
