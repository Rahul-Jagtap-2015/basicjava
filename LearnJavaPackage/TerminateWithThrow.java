package LearnJavaPackage;

public class TerminateWithThrow
{
public static void main(String[] args)
{
	System.out.println("Program started...");

    // Terminate abruptly using throw
    throw new RuntimeException("Forced termination!");

    // Unreachable code (compiler warning)
    // System.out.println("This line won't execute");
}
}
