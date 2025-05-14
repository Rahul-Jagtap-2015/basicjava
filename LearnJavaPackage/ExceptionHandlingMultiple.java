package LearnJavaPackage;

import java.util.Scanner;

import graphql.org.antlr.v4.runtime.InputMismatchException;

public class ExceptionHandlingMultiple
{
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
    
	try {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number (for division): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter array index (0-2): ");
        int index = scanner.nextInt();
        
        int result = a / b;
        System.out.println("Division result: " + result);
        
        int[] numbers = {10, 20, 30};
        
        System.out.println("Array element: " + numbers[index]);
    } 
    	catch (ArithmeticException e)
    {
        System.out.println("Math Error: " + e.getMessage());
    } 	
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Error: Invalid index " + e.getMessage());
    } 	
    catch (InputMismatchException e)
    {
        System.out.println("Input Error: Please enter integers only");
    }	
    finally
    {	System.out.println("Operation complete (cleanup in finally)");
    
        scanner.close();
}}
}
