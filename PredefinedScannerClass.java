package LearnJavaPackage;
import java.util.Scanner; // scanner class needs to be imported every time
public class PredefinedScannerClass
{

	public static void main(String[] args)
{
		Scanner s1=new Scanner(System.in); //to invoke System constructor to accept input
		
		System.out.println("Please enter the age");
	
		int age=s1.nextInt();
		
		System.out.println(age);
		
		System.out.println("Please enter value of a");
				
		int a=s1.nextInt();
		
		System.out.println("Please enter value of b");
		
		int b=s1.nextInt();
		
		System.out.println("The maximun number is");
		
		System.out.println(Math.max(a, b));

		s1.close(); //scanner class variable needs to be closed at the end
}

}
