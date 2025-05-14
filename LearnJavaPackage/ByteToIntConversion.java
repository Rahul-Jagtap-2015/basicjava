package LearnJavaPackage;

public class ByteToIntConversion
{
public static void main(String[] args)
{
	byte smallNumber = 100;

	// Implicit conversion (widening)
	int convertedNumber = smallNumber;

	System.out.println("Original byte: " + smallNumber);
	System.out.println("Converted to int: " + convertedNumber);
}
}
