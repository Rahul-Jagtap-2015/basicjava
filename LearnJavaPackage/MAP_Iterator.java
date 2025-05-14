package LearnJavaPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP_Iterator
{
public static void main(String[] args)
{
	Map<Integer, String> Map = new HashMap<>();
    Map.put(101, "Rahul");
    Map.put(102, "Sneha");
    Map.put(103, "Amit");

    Set<Entry<Integer, String>> entrySet = Map.entrySet();

    Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

    System.out.println("Iterating Map using Iterator:");
    while (iterator.hasNext())
    {
        Entry<Integer, String> entry = iterator.next();
        System.out.println("Account No: " + entry.getKey() + ", Holder Name: " + entry.getValue());
    }
}
}
