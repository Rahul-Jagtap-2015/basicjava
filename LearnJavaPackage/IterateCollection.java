package LearnJavaPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateCollection
{
public static void main(String[] args)
{
	// Create a List (ArrayList) of Strings
    List<String> fruits = new ArrayList<String>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Mango");

    // Get an Iterator for the list
    Iterator<String> iterator = fruits.iterator();

    System.out.println("Iterating using Iterator:");

    // Check if there are more elements (hasNext())
    while (iterator.hasNext()) 
    {
    String fruit = iterator.next(); // Get the next element (next())
    System.out.println(fruit);

        // Remove "Banana" if found (remove())
        if (fruit.equals("Banana"))
        {
            iterator.remove();  // Safely removes current element
        }
    }

    System.out.println("\nList after removal:");
    System.out.println(fruits);
}
}
