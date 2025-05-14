package LearnJavaPackage;

public class StringBuilderMethods
{
public static void main(String[] args)
{
	StringBuilder sb=new StringBuilder("Hello");
	
	System.out.println(sb);
	
	System.out.println(sb.append(" World"));
		
	System.out.println(sb.insert(6, "Beautiful "));
	
	System.out.println(sb.reverse());
	
	System.out.println(sb.reverse());
		
	System.out.println(sb.replace(6, 21, "Java"));
		
	System.out.println(sb.delete(6, 10));
		
		
	StringBuilder sb1=new StringBuilder("Good Morning");
	System.out.println(sb1);
	
	System.out.println(sb1.capacity());
		
	System.out.println(sb1.subSequence(5, 12));
	
	System.out.println(sb1.hashCode());
	
	System.out.println(sb1.charAt(5));
			
}
}
