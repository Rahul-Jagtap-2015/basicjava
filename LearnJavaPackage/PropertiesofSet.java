package LearnJavaPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PropertiesofSet
{
public static void main(String[] args)
{
	Set<Comparable> s1=new HashSet<Comparable>();
	
	s1.add("ABC");
	s1.add(25);
	s1.add(100000);
	s1.add(45.50);
	s1.add(false);
	s1.add(false);
	s1.add("Random");
	
	System.out.println(s1);
	
	Iterator i1= s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
}
}
