package LearnJavaPackage;

public class ExceptionHandlingNestedTryCatch
{
public static void main(String[] args)
{
	try {// Outer try block
         System.out.println("Outer try block");

        try
        {
        int result = 10 / 0; // Inner try block - ArithmeticException
        System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e)
        {
        	System.out.println("Caught ArithmeticException in inner catch: " + e.getMessage());
        }
       
        int[] arr = {1, 2, 3};
        System.out.println("Accessing 4th element: " + arr[3]); // ArrayIndexOutOfBoundsException

    }
		catch (ArrayIndexOutOfBoundsException e)
	{
        System.out.println("Caught ArrayIndexOutOfBoundsException in outer catch:"+"\n"+e.getMessage());
    }

    System.out.println("Program continues after nested try-catch blocks...");
}
}
