package LearnJavaPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIterator
{
public static void main(String[] args)
{
	List<String> a1=new ArrayList<String>();
	
	a1.add("ABC");
	a1.add("DEF");
	a1.add("GHI");
	a1.add("JKL");
	a1.add("MNO");
	a1.add("PQR");
	
	Iterator<String> i1= a1.iterator();
	
	System.out.println("Forward Iteration using Iterator");
	
	while (i1.hasNext()) //forward iteration
	{
		System.out.println(i1.next());
	}
	
	ListIterator<String> i2=a1.listIterator();
	
	System.out.println("Forward Iteration using ListIterator");
	
	while (i2.hasNext()) //forward iteration
	{
		System.out.println(i2.next());
	}
	
	System.out.println("Backward Iteration using ListIterator");
	
	while (i2.hasPrevious()) //backward iteration
	{
		System.out.println(i2.previous());
	}
}
}
