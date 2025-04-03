package LearnJavaPackage;
import java.util.Scanner;
public class AreaOfSquare
{
	public static void main(String[] args)
{
		System.out.println("Please enter the value of length of the side of Square");

		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		
		int area=(a*a);
		
		System.out.println("The Area for the given square is");
		
		System.out.println(area);
		
		s.close();
	}

}
