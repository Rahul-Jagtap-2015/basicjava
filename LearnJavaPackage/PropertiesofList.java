package LearnJavaPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PropertiesofList
{
public static void main(String[] args)
{
	List<Integer> a1=new ArrayList<Integer>();
	
	a1.add(80);
	a1.add(55);
	a1.add(25);
	a1.add(75);
	a1.add(65);
	a1.add(28);
//	Collections.sort(a1);
	System.out.println(a1);
	
	Iterator i1= a1.iterator();
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}

	
}
}
