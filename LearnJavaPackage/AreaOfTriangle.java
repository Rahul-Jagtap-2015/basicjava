package LearnJavaPackage;
import java.util.Scanner;
public class AreaOfTriangle
{
public static void main(String[] args) 
{
	System.out.println("Please enter the value for Base of Triangle");
	
	Scanner T=new Scanner(System.in);
	
	int b=T.nextInt();
	
	System.out.println("Please enter the value for Height of Triangle");
	
	int h=T.nextInt();
		
	double Area=0.5*b*h;

	System.out.println("The Area of Triangle for the given Base and Height is");
	
	System.out.println(Area);
	
	T.close();
}	 
}