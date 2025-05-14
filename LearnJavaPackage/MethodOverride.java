package LearnJavaPackage;
class Precondition
{
	void Login()
	{
		System.out.println("Login with email id");
	}
}
public class MethodOverride extends Precondition
{
		//below child class will override the parent class

	void Login()
	{
		super.Login();
		System.out.println("Login with mobile no.");
	}

	public static void main(String[] args)
{
		MethodOverride m1=new MethodOverride();
		m1.Login();
		
}

}
