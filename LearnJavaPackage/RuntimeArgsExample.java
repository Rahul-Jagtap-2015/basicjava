package LearnJavaPackage;

public class RuntimeArgsExample
{
public static void main(String[] args)
{
	if (args.length == 0)
	{
        System.out.println("No arguments provided at runtime.");
    } 
	else
	{
        System.out.println("Arguments passed at runtime:");
        for (int i = 0; i < args.length; i++)
        {
         System.out.println("Argument " + i + ": " + args[i]);
        }
		}
}
}