package LearnJavaPackage;

public class DoubleToIntConversion
{
public static void main(String[] args)
{
	double price = 99.99;

    // Explicit conversion (narrowing)
    int convertedPrice = (int) price;

    System.out.println("Original double: " + price);
    System.out.println("Converted to int: " + convertedPrice);
}
}
