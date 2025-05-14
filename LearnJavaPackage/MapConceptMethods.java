package LearnJavaPackage;

import java.util.HashMap;
import java.util.Map;

public class MapConceptMethods
{
public static void main(String[] args)
{
	Map<Integer, String> employeeMap = new HashMap<>();

    // put() - Add entries to the map
    employeeMap.put(101, "Rahul");
    employeeMap.put(102, "Sneha");
    employeeMap.put(103, "Karan");
    employeeMap.put(104, "Megha");

    // get() - Retrieve value by key
    System.out.println("Employee with ID 102: " + employeeMap.get(102));

    // containsKey() - Check if a key exists
    System.out.println("Is ID 105 present? " + employeeMap.containsKey(105));

    // containsValue() - Check if a value exists
    System.out.println("Is employee Megha present? " + employeeMap.containsValue("Megha"));

    // keySet() - Get all keys
    System.out.println("\nAll Employee IDs:");
    for (Integer id : employeeMap.keySet()) {
        System.out.println(id);
    }

    // values() - Get all values
    System.out.println("\nAll Employee Names:");
    for (String name : employeeMap.values())
    {
        System.out.println(name);
    }

    // entrySet() - Get key-value pairs
    System.out.println("\nAll Entries (Key-Value Pairs):");
    for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
    {
        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
    }

    // remove() - Remove a mapping by key
    employeeMap.remove(103);
    System.out.println("\nAfter removing ID 103:");
    System.out.println(employeeMap);

    // size() - Get the number of entries
    System.out.println("Total employees: " + employeeMap.size());

    // isEmpty() - Check if map is empty
    System.out.println("Is the map empty? " + employeeMap.isEmpty());

    // clear() - Remove all entries
    employeeMap.clear();
    System.out.println("Map after clearing: " + employeeMap);
}
}
