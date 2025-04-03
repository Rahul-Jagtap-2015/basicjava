package LearnJavaPackage;
import java.util.Scanner;
public class AreaOfCircle 
{
public static void main(String[] args) 
{
	System.out.println("Please enter the value of radius");
	
	Scanner s1=new Scanner(System.in);
	
	int r=s1.nextInt();
	
	double area=Math.PI*r*r;

	System.out.println("The Area of Circle for the given radius is");
	
	System.out.println(area);
	
	s1.close();
}	 
}