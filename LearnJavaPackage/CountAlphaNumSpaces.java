package LearnJavaPackage;

import java.util.Arrays;

//Find out the alphabets, numbers, spaces & special chars present in array

public class CountAlphaNumSpaces
{
	static int countofalpha=0;
	static int countofnum=0;
	static int countofspaces=0;
	
public static void main(String[] args)
{
	String input="** Sarhad School Pune 46 **";
	int size=input.length();
	char [] array=input.toCharArray();
	System.out.println("Input Array is:> "+Arrays.toString(array));
	System.out.println("Length of Array is "+size);
	
	for(int i=0;i<=array.length-1;i++)
	{
		boolean b1=Character.isAlphabetic(array[i]);
		if(b1==true)
		{
			countofalpha++;
		}
		boolean b2=Character.isDigit(array[i]);
		if(b2==true)
		{
			countofnum++;
		}
		boolean b3=Character.isWhitespace(array[i]);
		if(b3==true)
		{
			countofspaces++;
		}
}
	int countofspechar=input.length()-(countofalpha+countofnum+countofspaces);
	System.out.println("Count of Alphabets is:- " +countofalpha);
	System.out.println("Count of Numbers is:- " +countofnum);
	System.out.println("Count of Spaces is:- " +countofspaces);
	System.out.println("Count of Special Chars is:- " +countofspechar);
		
}
}
