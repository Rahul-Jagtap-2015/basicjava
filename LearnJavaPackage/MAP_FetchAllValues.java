package LearnJavaPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MAP_FetchAllValues
{
public static void main(String[] args)
{
	Map<Integer, String> Map = new HashMap<>();
    Map.put(101, "Rahul");
    Map.put(102, "Sneha");
    Map.put(103, "Amit");

    Collection<String> allValues = Map.values(); // Fetch all values using values()

    System.out.println("All values in the map:");
    for (String value : allValues)
    {
        System.out.println(value);
    }
}}
