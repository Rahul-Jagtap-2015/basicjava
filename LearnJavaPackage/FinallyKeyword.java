package LearnJavaPackage;

public class FinallyKeyword
{
public static void main(String[] args)
{
	try
	{	int result = 2/0; // No exception
	System.out.println("Result: " + result);
    } 
	catch (ArithmeticException e)
	{
	System.out.println("Error: " + e.getMessage());
    }
	finally
	{
	System.out.println("This will ALWAYS execute (1)");
    }
}
}
