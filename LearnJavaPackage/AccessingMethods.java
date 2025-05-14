package LearnJavaPackage;

public class AccessingMethods
{
	static void	add()
	{
		System.out.println("Addition");
	}
	static void subtract()
	{
		System.out.println("Subtraction");	
	}

	static void multi()
	{
		System.out.println("Multiplication");
	}
	
public static void main(String[] args)
{
	System.out.println("I'm the Main Method");
	
	multi(); // code is called from outside into the main method
	
	subtract(); // code is called from outside into the main method
	
	add(); // code is called from outside into the main method
}


}