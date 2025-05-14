package LearnJavaPackage;
class Three
{
	void a()
	{
		
	}
}
class Two extends Three
{
	static void b()
	{
		
	}
}
class One extends Two
{
	static void c()
	{
		
	}
}
public class Inheritance_MultiLevelIProgram extends One
{
	void d()
	{
		
	}
	
	public static void main(String[] args)
{
		Inheritance_MultiLevelIProgram m1=new Inheritance_MultiLevelIProgram();
	
	m1.a();
	b();
	c();
	m1.d();	
}

}
