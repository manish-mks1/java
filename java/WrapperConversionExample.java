public class WrapperConversionExample {
    public static void main(String[] args) {
        // Initialize a primitive variable
        int number = 42;
        System.out.println("Initial value (int): " + number);

        // int to Integer
        Integer integerNumber = Integer.valueOf(number);
        System.out.println("Converted to Integer: " + integerNumber);

        // Integer to String
        String stringNumber = integerNumber.toString();
        System.out.println("Converted to String: " + stringNumber);

        // String to int
        int parsedInt = Integer.parseInt(stringNumber);
        System.out.println("Parsed to int: " + parsedInt);

        // int to String
        String intToString = String.valueOf(number);
        System.out.println("Converted to String: " + intToString);

        // String to Integer
        Integer parsedInteger = Integer.valueOf(intToString);
        System.out.println("Parsed to Integer: " + parsedInteger);

        // Integer to int
        int unboxedInt = parsedInteger.intValue();
        System.out.println("Unboxed to int: " + unboxedInt);
    }
}
