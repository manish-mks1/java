public class StudentInfo {
    public static void main(String[] args) {
        try {
            // Initialize array variables for names and admission numbers
            String[] names = {
                "John", "Emma", "Michael", "Sophia", "William",
                "Olivia", "James", "Ava", "Benjamin", "Isabella"
            };

            int[] admissionNumbers = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };

            // Display student information
            System.out.print("Student    ");
            System.out.print("Name    ");
            System.out.print("     Admission Number");
            System.out.println();
            for (int i = 0; i < 15; i++) {
                System.out.print( (i + 1) + "         ");
                System.out.print(names[i]+"   ");
                System.out.print(admissionNumbers[i]);
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds! Program will terminate.");
        }
    }
}
