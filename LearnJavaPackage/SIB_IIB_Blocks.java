package LearnJavaPackage;

public class SIB_IIB_Blocks
{
	static // Static Initialization Block (SIB)
    {
        System.out.println("Inside Static Initialization Block (SIB)");
    }

    // Instance Initialization Block (IIB)
    {
        System.out.println("Inside Instance Initialization Block (IIB)");
    }

    // Constructor
    public SIB_IIB_Blocks()
    {
        System.out.println("Inside Constructor");
    }
public static void main(String[] args)
{
	System.out.println("Inside main method");

    // Create first object
	SIB_IIB_Blocks obj1 = new SIB_IIB_Blocks();

    System.out.println("---");

    // Create second object
    SIB_IIB_Blocks obj2 = new SIB_IIB_Blocks();
}
}
