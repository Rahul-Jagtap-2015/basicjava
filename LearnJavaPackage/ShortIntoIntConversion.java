package LearnJavaPackage;

public class ShortIntoIntConversion
{
public static void main(String[] args)
{
	// 1. Implicit conversion (widening)
    short shortValue = 32767;  // Maximum short value
    int intValue = shortValue; // Automatic conversion
    
    System.out.println("Implicit conversion:");
    System.out.println("short value: " + shortValue);
    System.out.println("int value: " + intValue);

    // 2. Explicit conversion (not needed)
    int explicitIntValue = (int)shortValue;
    System.out.println("\nExplicit conversion:");
    System.out.println("int value: " + explicitIntValue);

    // 3. Handling negative values
    short negativeShort = -32768; // Minimum short value
    int negativeInt = negativeShort;
    System.out.println("\nNegative value conversion:");
    System.out.println("short: " + negativeShort);
    System.out.println("int: " + negativeInt);
}
}
