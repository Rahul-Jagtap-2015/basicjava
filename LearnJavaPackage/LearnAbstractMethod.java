package LearnJavaPackage;
abstract class AbstractClass
{
	abstract void Login();
}
public class LearnAbstractMethod extends AbstractClass
{

	public static void main(String[] args)
{
		LearnAbstractMethod a=new LearnAbstractMethod();
		a.Login();
}
	//always need to create an object of child class and call the method
	//to get the output
	
@Override
	void Login()
{		
	System.out.println("Implementation from Abstract class");
}
}
