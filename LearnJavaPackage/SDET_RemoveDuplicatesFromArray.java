package LearnJavaPackage;

import java.util.HashSet;

public class SDET_RemoveDuplicatesFromArray
{
public static void main(String[] args)
{
	int[] arr={5,5,7,7,12,12};
	
	HashSet<Integer>set=new HashSet<Integer>();
	
	for(int num:arr)
	{
		set.add(num);
	}
	System.out.println(set);
}
}
