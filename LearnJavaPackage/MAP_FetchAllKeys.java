package LearnJavaPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MAP_FetchAllKeys
{
public static void main(String[] args)
{
	Map<Integer, String> Map = new HashMap<>();
    Map.put(101, "Rahul");
    Map.put(102, "Sneha");
    Map.put(103, "Amit");

    Set<Integer> allKeys = Map.keySet(); // Fetching all keys using keySet()

    System.out.println("All keys in the map:");
    for (Integer key : allKeys)
    {
        System.out.println(key);
    }
}
}
