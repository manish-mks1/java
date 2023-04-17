import java.util.Scanner;
abstract class shape{
    int a,b;
    abstract double area();
}
class Rectangle extends shape{
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lenght:");
        this.a=sc.nextInt();
        System.out.print("Enter width:");
        this.b=sc.nextInt();
        return (this.a*this.b);
    }
}
class Triangle extends shape{  
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        this.a=sc.nextInt();
        System.out.print("Enter hight:");
        this.b=sc.nextInt();
        return (0.5*this.a*this.b);
    }
}
class Circle extends shape{
    private final double PI = 3.14159;
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radious:");
        this.a=sc.nextInt();
        return (this.PI*this.a*this.a);
    }
}
public class exp8 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nCalculate area of ");
        System.out.println("1. rectangle \n2. Triangle \n3. circle ");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                Rectangle rect = new Rectangle();
                System.out.println("Area of rectangle: " + rect.area());
                break;
            case 2:
                Triangle sq = new Triangle();
                System.out.println("Area of Triangle: " + sq.area());
                break;
            case 3:
                Circle cir = new Circle();
                System.out.println("Area of circle: " + cir.area());
                break;
            default:
                System.out.print("Invalid input..");
                break;
        }
    }
}



