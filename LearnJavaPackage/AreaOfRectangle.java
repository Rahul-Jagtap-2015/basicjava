package LearnJavaPackage;
import java.util.Scanner;
public class AreaOfRectangle
{
	public static void main(String[] args)
{
		System.out.println("Enter the length of the Rectangle");
		
		Scanner a1=new Scanner(System.in);
		
		float l=a1.nextFloat();
		
		System.out.println("Enter the width of the Rectangle");
		
		float w=a1.nextFloat();
		
		double area=(l*w);
		
		System.out.println("Area of the given Rectangle is");
		
		System.out.println(area);
		
		a1.close();
	
	}

}
