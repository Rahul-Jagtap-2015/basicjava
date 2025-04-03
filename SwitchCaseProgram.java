package LearnJavaPackage;
import java.util.Scanner;
public class SwitchCaseProgram
{
	public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please Enter the Case number to execute");
	
	int input=s1.nextInt();
			
	switch (input) //given case number will execute else default will be executed
	{
	case 1:  System.out.println("Chrome browser Automation");
			break; //not mandatory, but if not given break stmt then below case also executes
		
	case 2:  System.out.println("Mozilla browser Automation");
			break;
		
	case 3:  System.out.println("Edge browser Automation");
			break;
		
	case 4:  System.out.println("Safari browser Automation");
			break;
		
	default: System.out.println("No Browser is selected");
	
	s1.close();
	}

	}

}
