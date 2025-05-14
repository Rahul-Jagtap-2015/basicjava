package LearnJavaPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET_SetUsingIterator
{
public static void main(String[] args)
{
	Set<String> countries = new HashSet<>();
    countries.add("India");
    countries.add("USA");
    countries.add("Germany");
    countries.add("Japan");
    countries.add("Australia");

    // Create an Iterator
    Iterator<String> iterator = countries.iterator();

    System.out.println("Countries in the Set:");

    // Iterate using Iterator
    while (iterator.hasNext())
    {
        String country = iterator.next();
        System.out.println(country);
    }
}
}
