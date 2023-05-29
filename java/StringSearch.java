import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character or substring to search: ");
        String search = sc.nextLine();

        int firstIndex = input.indexOf(search);
        if (firstIndex != -1) {
            System.out.println("First occurrence found at index: " + firstIndex);
        } else {
            System.out.println("No occurrence found.");
        }

        int lastIndex = input.lastIndexOf(search);
        if (lastIndex != -1) {
            System.out.println("Last occurrence found at index: " + lastIndex);
        } else {
            System.out.println("No occurrence found.");
        }
    }
}
