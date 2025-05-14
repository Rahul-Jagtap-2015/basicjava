package LearnJavaPackage;

public class IntToByteConversion1
{
public static void main(String[] args)
{
	int number = 130;

    // Explicit conversion (narrowing)
    byte convertedNumber = (byte) number;

	System.out.println("Original int: " + number);
	System.out.println("Converted to byte: " + convertedNumber);
}
}
