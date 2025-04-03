package LearnJavaPackage;

public class NonStaticParameterizedMethod
{
	void add(int a, int b)
	{
		System.out.println(a+b);
}
	void multiply(int a, int b)
	{
		System.out.println(a*b);
}
	void area(int l, int w)
	{
		System.out.println(l*w);
}
	void div(int c, int d)
	{
		System.out.println(c/d);
	}
	
	public static void main(String[] args) {
		
		NonStaticParameterizedMethod n=new NonStaticParameterizedMethod();
		
		n.add(100, 200);
		n.multiply(3, 150);
		n.area(40, 80);
		n.div(750, 25);
	}
}