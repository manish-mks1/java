import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Durian");

        // Read elements from ArrayList using Iterator
        System.out.println("Elements of the original ArrayList:");
        Iterator<String> iterator = originalList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        // Create a duplicate object of the ArrayList
        ArrayList<String> duplicateList = new ArrayList<>(originalList);

        // Reverse the content of the ArrayList
        Collections.reverse(duplicateList);

        // Print the reversed ArrayList
        System.out.println("Reversed ArrayList:");
        for (String element : duplicateList) {
            System.out.println(element);
        }
    }
}
