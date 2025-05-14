package LearnJavaPackage;

import java.util.ArrayList;
import java.util.Collection;

//Finding the behavior of Collection Interface
public class CollectionProperties
{
public static void main(String[] args)
{
	Collection<String> c1=new ArrayList<String>(); //upListcasting
	
	c1.add("Rahul");
	c1.add("Ram");
	c1.add("Raj");
	c1.add("Rai");
	//c1.remove("Rai");
	//c1.addAll(c1);
	//c1.clear();
	System.out.println(c1);
		
	//System.out.println(c1.size());
	
	//System.out.println(c1.containsAll(c1));
	
	Collection<Integer> c2=new ArrayList<Integer>();
	
	c2.add(35);
	c2.add(45);
	c2.add(55);
	c2.add(25);
	//c2.remove(55);
	//c2.removeAll(c2);
	System.out.println(c2);
	
	//System.out.println(c2.contains(45));
	
}
}
