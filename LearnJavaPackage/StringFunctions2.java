package LearnJavaPackage;

public class StringFunctions2
{
	public static void main(String[] args)
{
		String a="RAHUL JAGTAP";
		String b="rahul jagtap";
				
		boolean c=a.equals(b);//compare strings to check if they are same
		
		System.out.println(c);
		
		boolean d=a.equalsIgnoreCase(b);
		
		System.out.println(d);//compare ignoring the case
		
		String l=a.toLowerCase();
			
		boolean e=l.contains("p");
		
		System.out.println(e);
		
		System.out.println(a.substring(6));
		
		System.out.println(a.substring(0, 7));
}

}
