package LearnJavaPackage;

public class IntToDoubleConversion
{
public static void main(String[] args)
{
	int number = 25;

    // Implicit conversion (widening)
    double implicitDouble = number;

    // Explicit conversion (not needed for widening)
    double explicitDouble = (double) number;

    System.out.println("Original int: " + number);
    System.out.println("Implicitly converted to double: " + implicitDouble);
    System.out.println("Explicitly converted to double: " + explicitDouble);
}
}
