package LearnJavaPackage;

public class FloatIntoDoubleConversion
{
public static void main(String[] args)
{
	// 1. Implicit conversion (automatic widening)
    float floatValue = 1234.56f;
    double doubleValue = floatValue; // Automatic conversion
    
    System.out.println("Implicit conversion:");
    System.out.println("float value: " + floatValue);
    System.out.println("double value: " + doubleValue);

    // 2. Explicit conversion (not needed but possible)
    double explicitDoubleValue = (double)floatValue;
    System.out.println("\nExplicit conversion:");
    System.out.println("double value: " + explicitDoubleValue);

    // 3. Precision comparison
    float piFloat = 3.141592653589793f;
    double piDouble = piFloat;
    System.out.println("\nPrecision comparison:");
    System.out.println("float PI:  " + piFloat);
    System.out.println("double PI: " + piDouble);
}
}
