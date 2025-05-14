package LearnJavaPackage;
import java.util.ArrayList;
import java.util.List;
public class ListMethods
{
public static void main(String[] args)
{
	// 1. Create a List
    List<String> fruits = new ArrayList<>();
    
    // 2. add() - Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    System.out.println("Initial List: " + fruits);
    
    // 3. add(index, element) - Insert at specific position
    fruits.add(1, "Mango");
    System.out.println("After inserting Mango at index 1: " + fruits);
    
    // 4. get() - Access element by index
    String fruit = fruits.get(2);
    System.out.println("Element at index 2: " + fruit);
    
    // 5. set() - Update element
    fruits.set(0, "Pineapple");
    System.out.println("After replacing Apple with Pineapple: " + fruits);
    
    // 6. remove() - By index and by object
    fruits.remove(3); // Removes "Orange"
    fruits.remove("Banana");
    System.out.println("After removals: " + fruits);
    
    // 7. size() - Get list size
    System.out.println("List size: " + fruits.size());
    
    // 8. contains() - Check if element exists
    System.out.println("Contains Mango? " + fruits.contains("Mango"));
    
    // 9. indexOf() - Find index of element
    System.out.println("Index of Pineapple: " + fruits.indexOf("Pineapple"));
    
    // 10. isEmpty() - Check if list is empty
    System.out.println("Is list empty? " + fruits.isEmpty());
    
    // 11. clear() - Remove all elements
    fruits.clear();
    System.out.println("After clear(): " + fruits);

}
}
