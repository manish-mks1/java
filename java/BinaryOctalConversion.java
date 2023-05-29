import java.util.Scanner;

public class BinaryOctalConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Binary to Octal");
        System.out.println("2. Octal to Binary");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // Binary to Octal
                System.out.print("Enter a binary number: ");
                String binary = input.next();
                String octal = binaryToOctal(binary);
                System.out.println("Octal equivalent: " + octal);
                break;

            case 2:
                // Octal to Binary
                System.out.print("Enter an octal number: ");
                String oct = input.next();
                String bin = octalToBinary(oct);
                System.out.println("Binary equivalent: " + bin);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static String binaryToOctal(String binary) {
        // Pad with zeros to make length multiple of 3
        int length = binary.length();
        int numZeros = length % 3;
        if (numZeros != 0) {
            for (int i = 0; i < 3 - numZeros; i++) {
                binary = "0" + binary;
            }
        }

        // Convert to octal
        StringBuilder octal = new StringBuilder();
        int index = 0;
        while (index < length) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += (binary.charAt(index + i) - '0') * (1 << (2 - i));
            }
            octal.append(sum);
            index += 3;
        }
        return octal.toString();
    }

    public static String octalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            int digit = octal.charAt(i) - '0';
            String binaryDigit = Integer.toBinaryString(digit);
            if (i != 0 && binaryDigit.length() < 3) {
                for (int j = 0; j < 3 - binaryDigit.length(); j++) {
                    binary.append("0");
                }
            }
            binary.append(binaryDigit);
        }
        return binary.toString();
    }
}
