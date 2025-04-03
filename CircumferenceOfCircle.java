package LearnJavaPackage;
import java.util.Scanner;
public class CircumferenceOfCircle 
{
public static void main(String[] args) 
{
	System.out.println("Please enter the value of radius");
	
	Scanner s1=new Scanner(System.in);
	
	int r=s1.nextInt();
	
	double circumference=2*Math.PI*r;

	System.out.println("The Circumference of Circle for the given radius is");
	
	System.out.println(circumference);

	s1.close();
}	 
}