package LearnJavaPackage;
import java.util.Scanner;
public class CircumferenceOfTriangle
{
	public static void main(String[] args)
	
	{
		System.out.println("Enter the length of all 3 sides of the Triangle");

	Scanner w=new Scanner(System.in);
	
	float a=w.nextFloat();
	
	float b=w.nextFloat();
	
	float c=w.nextFloat();
	
	double circumference=a+b+c;
	
	System.out.println("The circumference for the given triangle is");
	
	System.out.println(circumference);
	
	w.close();
}
} 