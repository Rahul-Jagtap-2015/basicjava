package LearnJavaPackage;

public class DoubleToFloatConversion
{
public static void main(String[] args)
{
	double amount = 12345.678946;

    // Explicit conversion (narrowing)
	float convertedAmount = (float) amount;

	System.out.println("Original double: " + amount);
	System.out.println("Converted to float: " + convertedAmount);
}
}