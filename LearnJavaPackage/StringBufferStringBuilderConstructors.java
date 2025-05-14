package LearnJavaPackage;

public class StringBufferStringBuilderConstructors
{
public static void main(String[] args)
{
	 // 1. Default constructor (initial capacity = 16)
	StringBuffer sb1 = new StringBuffer();
    sb1.append("Hello");
    System.out.println("StringBuffer 1: " + sb1);

    // 2. Constructor with initial capacity
    StringBuffer sb2 = new StringBuffer(50);
    sb2.append("Java");
    System.out.println("StringBuffer 2: " + sb2);

    // 3. Constructor with initial string
    StringBuffer sb3 = new StringBuffer("SDET");
    System.out.println("StringBuffer 3: " + sb3);


    // ===== StringBuilder Constructors =====

    // 1. Default constructor (initial capacity = 16)
    StringBuilder sbl1 = new StringBuilder();
    sbl1.append("World");
    System.out.println("StringBuilder 1: " + sbl1);

    // 2. Constructor with initial capacity
    StringBuilder sbl2 = new StringBuilder(100);
    sbl2.append("Automation");
    System.out.println("StringBuilder 2: " + sbl2);

    // 3. Constructor with initial string
    StringBuilder sbl3 = new StringBuilder("Engineer");
    System.out.println("StringBuilder 3: " + sbl3);
}
}
