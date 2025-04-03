package LearnJavaPackage;

public class StaticParameterizedMethod
{
	static void Name(String name)
	{
		System.out.println(name);
	}
	
	static void Student(String name, char gender, double salary)
	{
		System.out.println(name);
		System.out.println(gender);
		System.out.println(salary);
	}
	
	static void Teacher(boolean a, boolean b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args)
	
	{
		Teacher(true, false);
		Student("Akshay", 'M', 85000);
		Name("Rakesh");
	
	}

}
