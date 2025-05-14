package LearnJavaPackage;

public class PrivateVariable{

private int age=35;

public static void main(String[] args)
{
	PrivateVariable p1=new PrivateVariable();
	
	System.out.println(p1.age);
}

public int getA()
{
	return age;
}

public void setA(int a)
{
	this.age = a;
}
	
}