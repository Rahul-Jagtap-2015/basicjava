package LearnJavaPackage;

public class ShortIntoByteConversion
{
public static void main(String[] args)
{
	short shortValue = 1000; // Exceeds byte range (-128 to 127)
    
    // Explicit casting to byte
    byte byteValue = (byte) shortValue;
    
    System.out.println("Original short value: " + shortValue);
    System.out.println("Converted byte value: " + byteValue);
    System.out.println("\nExplanation: " + getConversionExplanation(shortValue, byteValue));
}

	private static String getConversionExplanation(short original, byte converted) {
    return "Conversion Process:\n" +
           "1. short is 16-bit (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")\n" +
           "2. byte is 8-bit (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")\n" +
           "3. Java truncates the 16-bit short to 8-bit by:\n" +
           "   - Taking only the least significant 8 bits\n" +
           "   - Binary of " + original + ": " + String.format("%16s", 
               Integer.toBinaryString(original & 0xFFFF)).replace(' ', '0') + "\n" +
           "   - Last 8 bits: " + String.format("%8s", 
               Integer.toBinaryString(converted & 0xFF)).replace(' ', '0') + "\n" +
           "4. Result: " + converted + " (due to integer overflow)";
}
}
