public class OverloadingDemo {

    // Constructor overloading
    public OverloadingDemo() {
        System.out.println("Default constructor called");
    }

    public OverloadingDemo(int x) {
        System.out.println("Constructor with one integer parameter called: " + x);
    }

    public OverloadingDemo(String s) {
        System.out.println("Constructor with one string parameter called: " + s);
    }

    // Method overloading
    public int add(int x, int y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public String add(String s1, String s2) {
        return s1 + " " + s2;
    }

    public static void main(String[] args) {
        // Create objects using constructor overloading
        OverloadingDemo obj1 = new OverloadingDemo();
        OverloadingDemo obj2 = new OverloadingDemo(10);
        OverloadingDemo obj3 = new OverloadingDemo("Hello World!");

        // Call methods using method overloading
        System.out.println("add(int x, int y): " + obj1.add(5, 10));
        System.out.println("add(double x, double y): " + obj1.add(3.14, 2.71));
        System.out.println("add(String s1, String s2): " + obj1.add("Hello", "World"));
    }
}
