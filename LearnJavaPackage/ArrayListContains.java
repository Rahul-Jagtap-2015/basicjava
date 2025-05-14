package LearnJavaPackage;

import java.util.ArrayList;

public class ArrayListContains
{
	public static void main(String[] args) throws Exception
{
		ArrayList<String> s1=new ArrayList<String>();
		
		s1.add("AB");
		s1.add("BC");
		
		System.out.println(s1.contains("AB"));
		
		s1.set(1, "CD"); //replace the value at index 1
		
		System.out.println(s1);
				
		System.out.println(s1.get(0));
		
		for(int i=10; i<=100;i+=10)
		{
			Thread.sleep(500);
			System.out.println(i);
		}

		
	

}

}
