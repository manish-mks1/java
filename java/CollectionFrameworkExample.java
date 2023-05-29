import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // List Interface and ArrayList Implementation
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("List elements:");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        // Set Interface and HashSet Implementation
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Set elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // Queue Interface and LinkedList Implementation
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();

        // Map Interface and HashMap Implementation
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);

        System.out.println("Map elements:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}
