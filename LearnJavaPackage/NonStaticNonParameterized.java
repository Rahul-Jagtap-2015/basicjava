package LearnJavaPackage;

public class NonStaticNonParameterized
{
	void name()
	{
		System.out.println("Your name is Aakash");
}
	void email()
	{
		System.out.println("Email = Aakash@gmail.com");
}
	void phone()
	{
		System.out.println("Mobile number is 99999999999");
}
	void add()
	{
		System.out.println("Address is Banglore");
	}
	
	public static void main(String[] args)
	
	{
		NonStaticNonParameterized n=new NonStaticNonParameterized();
		n.name();
		n.email();
		n.phone();
		n.add();
	}

}
