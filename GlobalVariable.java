package LearnJavaPackage;

public class GlobalVariable
{
	static int noofdays2025=365;
	{
		
	}	
	int noofdays2024=366;
		
	public static void main(String[] args)
	{
		int perday=200;
		perday=220; //updating the value of local variable
					
		noofdays2025=350; //updating the value of static global variable
		
		int totalearning=perday*noofdays2025;

		System.out.println(totalearning);
	
		GlobalVariable e1=new GlobalVariable();
		
		e1.noofdays2024=351; //updating the value of non static global variable
				
		int totalearning2024=perday*e1.noofdays2024;
		
		System.out.println(totalearning2024);
	}

}
