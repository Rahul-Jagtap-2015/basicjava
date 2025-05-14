package LearnJavaPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList
{
public static void main(String[] args)
{
	List<String> students = new ArrayList<>();
    students.add("Zoya");
    students.add("Amit");
    students.add("Rahul");
    students.add("Sneha");
    students.add("Karan");

    System.out.println("Before Sorting:");
    System.out.println(students);

    // Sort in Ascending order
    Collections.sort(students);

    System.out.println("\nAfter Sorting (Ascending):");
    System.out.println(students);

    // Sort in Descending order
    Collections.sort(students, Collections.reverseOrder());

    System.out.println("\nAfter Sorting (Descending):");
    System.out.println(students);
}
}
