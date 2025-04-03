package LearnJavaPackage;

public class LogicalOperators
{
public static void main(String[] args)
{
	int a=10;
	int b=20;
	
	if(a!=b && b>a)
	{
		System.out.println("AND Operator");
	}
	if(a==b || b>a)
	{
		System.out.println("OR Operator");
	}
	if(!(a==b && b>a))		//inner bracket is FALSE so output will be TRUE
	{
		System.out.println("NOT Operator shows output for False Condition");
	}
	if(!(a<b && b>a))		//inner bracket is TRUE so output will be False
	{
		System.out.println("No Output for True Condition");
	}
	if(a==b && (b>a && a==10)) // output fo combination of True False condition will always be False
	{
		System.out.println("Hello");
	}
	if(a!=b && (b>a && a==10))
	{
		System.out.println("3 Conditions TRUE for AND Operator");
	}
}
}
