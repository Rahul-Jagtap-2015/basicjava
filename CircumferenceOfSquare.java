package LearnJavaPackage;
import java.util.Scanner;
public class CircumferenceOfSquare
{
	public static void main(String[] args)
{
		System.out.println("Please enter length of side of Square");
		
		Scanner p=new Scanner(System.in);
		
		float a=p.nextFloat();
		
		double circumference=(a*4);
		
		System.out.println("The Circumference for the given Square is");
		
		System.out.println(circumference);
		
		p.close();

	}

}
