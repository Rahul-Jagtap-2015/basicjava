package LearnJavaPackage;

public class StringFunctions1
{
public static void main(String[] args)
{
		String input="   Aarav is in 7th Class   ";
		
	int size=input.length();
	
	System.out.println(size); //to find the length of a string

	System.out.println(input.toUpperCase()); //to make all UPPER CASE
	
	System.out.println(input.toLowerCase()); //to make all lower case
	
	System.out.println(input.trim()); //to remove extra space from start & end but not from middle
	
	char a=input.charAt(19); //to find the character at index position 19
	
	System.out.println(a);
	
	int b=input.indexOf('h'); //to find the index position of letter 'h' 
	
	System.out.println(b);
	
}
}
