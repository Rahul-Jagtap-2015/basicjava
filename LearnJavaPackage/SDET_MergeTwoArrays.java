package LearnJavaPackage;

import java.util.Arrays;

public class SDET_MergeTwoArrays
{
public static void main(String[] args)
{
	int[] arr1= {4,8,12,10};
	
	int[] arr2= {5,7,11,15};
	
	int[] merged=new int[arr1.length + arr2.length];
	
	System.arraycopy(arr1, 0, merged, 0, arr1.length);
	
	System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
	
	System.out.println(Arrays.toString(merged));
	
	Arrays.sort(merged);
	
	System.out.println(Arrays.toString(merged));
	
	
}
}
