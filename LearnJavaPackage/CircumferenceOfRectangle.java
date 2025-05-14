package LearnJavaPackage;
import java.util.Scanner;
public class CircumferenceOfRectangle {

	public static void main(String[] args)
{
		System.out.println("Enter the length of the Rectangle");
		
		Scanner c1=new Scanner(System.in);
		
		float l=c1.nextFloat();
		
		System.out.println("Enter the width of the Rectangle");	
		
		float w=c1.nextFloat();
		
		double circumference=(2*(l+w));
		
		System.out.println("The Circumference of the given Rectangle is");
		
		System.out.println(circumference);
		
		c1.close();
	}

}
