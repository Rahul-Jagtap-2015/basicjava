package LearnJavaPackage;

import java.util.LinkedList;

public class UpcastingSyntax
{
	void add()
	{
		
	}
public static void main(String[] args)
{
	new UpcastingSyntax(); //UpCasting syntax [implicit syntax]
	
	Object o=new UpcastingSyntax(); //UpCasting syntax [implicit syntax]
	
	Object o1=(Object)new UpcastingSyntax(); //UpCasting syntax [explicit syntax]
	
	LinkedList l1=new LinkedList();
}
}
