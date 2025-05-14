package LearnJavaPackage;

public class SDET_FindTLargestElementInArray
{
public static void main(String[] args)
{
	int[] arr= {8,14,95,45,64};
	
	int largest=arr[0];
	
	for(int num:arr)
	{
		if(num>largest)
		{
			largest=num;
		}
	}
	System.out.println(largest);
	
}
}
