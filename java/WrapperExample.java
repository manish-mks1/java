public class WrapperExample {
    public static void main(String[] args) {
        // Initializing a primitive variable
        int number = 42;

        // Wrapping the primitive variable using Integer wrapper class
        Integer wrappedNumber = Integer.valueOf(number);

        // Performing various operations using wrapper class methods
        System.out.println("Initial value: " + wrappedNumber);

        // Incrementing the value
        wrappedNumber = wrappedNumber + 1;
        System.out.println("After increment: " + wrappedNumber);

        // Converting to binary string representation
        String binaryString = Integer.toBinaryString(wrappedNumber);
        System.out.println("Binary representation: " + binaryString);

        // Getting the maximum value
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Max value: " + maxValue);

        // Parsing a string to an integer
        String numberString = "123";
        int parsedNumber = Integer.parseInt(numberString);
        System.out.println("Parsed number: " + parsedNumber);
    }
}
