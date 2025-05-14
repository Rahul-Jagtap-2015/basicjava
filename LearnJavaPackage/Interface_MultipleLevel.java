package LearnJavaPackage;
interface RomanI
{
	void A();
	void B();
}
interface RomanII
{
	void C();
	void D();
}
public class Interface_MultipleLevel implements RomanI, RomanII
{
	static void E()
	{
		
	}
	void F()
	{
		
	}
public static void main(String[] args)
{
	E();
	
	Interface_MultipleLevel s1= new Interface_MultipleLevel();
	
	s1.F();
}
@Override
public void C() {
	// TODO Auto-generated method stub
	
}
@Override
public void D() {
	// TODO Auto-generated method stub
	
}
@Override
public void A() {
	// TODO Auto-generated method stub
	
}
@Override
public void B() {
	// TODO Auto-generated method stub
}

}