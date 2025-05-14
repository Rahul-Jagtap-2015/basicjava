package LearnJavaPackage;

public class SDET_FindSecondLargestElementInArray
{
public static void main(String[] args)
{
	int[] arr= {45,21,98,87,64,34};
	
	int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
	
	for(int num:arr)
	{
		if(num>first)
		{
			second=first;
			
			first=num;
		}
		else if(num>second&&num!=first)
		{
			second=num;
		}
	}
	System.out.println(second);
}
}
