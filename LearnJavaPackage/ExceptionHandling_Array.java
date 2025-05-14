package LearnJavaPackage;

public class ExceptionHandling_Array
{
public static void main(String[] args)
{
	    int[] numbers = {10, 20, 30, 40};

        try
        {
            // Trying to access 6th element (index 5) in an array of size 4
            System.out.println("Accessing index 4: " + numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an index that doesn't exist in the array.");
        }
        System.out.println("Program continues after exception handling.");

}
}
