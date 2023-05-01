public class Student {
    private String name;
    private String city;
    private int age;
    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("John", "New York", 20);
        Student s2 = new Student("Alice", "San Francisco", 22);
        System.out.println("Student 1:");
        s1.printData();
        System.out.println("Student 2:");
        s2.printData();
    }
}
