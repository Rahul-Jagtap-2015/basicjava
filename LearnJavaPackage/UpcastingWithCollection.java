package LearnJavaPackage;

import java.util.ArrayList;
import java.util.List;

public class UpcastingWithCollection
{
public static void main(String[] args)
{
	// UPcasting: List<Object> can hold any data type
    List<Object> mixedList = new ArrayList<>();

    // Adding different data types (Integer, Double, String, Character)
    mixedList.add(10);          // Integer
    mixedList.add(3.14);       // Double
    mixedList.add("Hello");    // String
    mixedList.add('A');         // Character

    System.out.println("Initial List: "+mixedList);

    // 1. Add an element
    mixedList.add(true);        // Boolean
    System.out.println("After adding 'true': "+mixedList);

    // 2. Remove an element (by value)
    mixedList.remove(3.14);    // Removes Double 3.14
    System.out.println("After removing 3.14: "+mixedList);

    // 3. Check if an element exists (Contains)
    boolean containsHello = mixedList.contains("Hello");
    System.out.println("Does list contain 'Hello'? "+containsHello);

    // 4. Remove by index
    mixedList.remove(1);        // Removes element at index 1
    System.out.println("After removing index 1: "+mixedList);

    // 5. Iterate through the list
    System.out.println("\nIterating through the list:");
    for (Object item : mixedList)
    {
        System.out.println("Item: " + item + " (Type: " + item.getClass().getSimpleName() + ")");
    }
}
}
