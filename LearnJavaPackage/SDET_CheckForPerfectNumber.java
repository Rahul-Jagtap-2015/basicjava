package LearnJavaPackage;

public class SDET_CheckForPerfectNumber
{
public static void main(String[] args)
{
	int num=28, sum=0;
	
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum+=i;
		}
	}
	System.out.println(num==sum);
}
}
