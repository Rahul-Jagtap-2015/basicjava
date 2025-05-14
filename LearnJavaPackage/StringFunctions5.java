package LearnJavaPackage;

public class StringFunctions5
{
public static void main(String[] args)
{
	String input=("Good ");
	
	System.out.println(input);
	
	System.out.println(input.concat(" Morning").concat(" World"));
	
	System.out.println(input.contains("Good"));
	
	String input1=("Hello");
	
	System.out.println(input1.replace('e', 'a'));
	
	System.out.println(input1.replaceAll(input1, input));
	
	System.out.println(input1.matches(input));
	
	System.out.println(input.repeat(3));
	
	System.out.println(input1.substring(2));
	
}
}
