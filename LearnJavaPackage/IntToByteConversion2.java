package LearnJavaPackage;

public class IntToByteConversion2
{
public static void main(String[] args)
{
	int intValue = 10000;
    
    // Explicit casting to byte
    byte byteValue = (byte) intValue;
    
    System.out.println("Original int value: " + intValue);
    System.out.println("Converted byte value: " + byteValue);
    System.out.println("Explanation: " + getConversionExplanation(intValue, byteValue));
}

	private static String getConversionExplanation(int original, byte converted) {
    return "When converting int (" + original + ") to byte:\n" +
           "1. Java takes only the last 8 bits (due to byte's range of -128 to 127)\n" +
           "2. Binary: " + Integer.toBinaryString(original) + "\n" +
           "3. Last 8 bits: " + String.format("%8s", 
               Integer.toBinaryString(converted & 0xFF)).replace(' ', '0') + "\n" +
           "4. Resulting byte value: " + converted;
}
}
