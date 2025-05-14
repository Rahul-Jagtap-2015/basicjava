package LearnJavaPackage;

public class VivaTest
{
public static void main(String[] args)
{
	int[] array={1,2,3,4};
	
	try
	{
		System.out.println(array[4]);
	}
	catch (ArrayIndexOutOfBoundsException a)
	{
		System.out.println("Exception Handled " + a);
		
	}
	
}
}
