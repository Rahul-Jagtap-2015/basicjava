package LearnJavaPackage;

import java.util.HashMap;
import java.util.Map;

public class MAP_Methods
{
public static void main(String[] args)
{
	// Creating a Map of account numbers and account holder names
    Map<Integer, String> accountMap1 = new HashMap<>();

    // putIfAbsent(): Adds the entry only if the key is not already present
    accountMap1.putIfAbsent(101, "Rahul");
    accountMap1.putIfAbsent(102, "Sneha");
    accountMap1.putIfAbsent(103, "Amit");
    accountMap1.putIfAbsent(101, "Varun"); // Will not overwrite Rahul

    // get(): Get value using key
    System.out.println("Account 102 holder: " + accountMap1.get(102));

    // containsKey(): Check if a key exists
    System.out.println("Contains key 103? " + accountMap1.containsKey(103));

    // containsValue(): Check if a value exists
    System.out.println("Contains value 'Sneha'? " + accountMap1.containsValue("Sneha"));

    // Create another map to compare
    Map<Integer, String> accountMap2 = new HashMap<>();
    accountMap2.put(101, "Ladies");
    accountMap2.put(102, "Gentlemen");
    accountMap2.put(103, "Kids");

    // equals(): Compare two maps
    System.out.println("accountMap1 equals accountMap2? " + accountMap1.equals(accountMap2));

}
}
