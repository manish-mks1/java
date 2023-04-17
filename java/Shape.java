import java.util.Scanner;
class Rectangle {
    private double l;
    private double w;
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lenght:");
        this.l=sc.nextInt();
        System.out.print("Enter width:");
        this.w=sc.nextInt();
        return (this.l*this.w);
    }
}
class Square {
    private double side;    
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side:");
        this.side=sc.nextInt();
        return (this.side*this.side);
    }
}
class Circle {
    private double r;
    private final double PI = 3.14159;
    public double area() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radious:");
        this.r=sc.nextInt();
        return (this.PI*this.r*this.r);
    }
}
public class Shape {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nCalculate area of ");
        System.out.println("1. rectangle \n2. square \n3. circle ");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                Rectangle rect = new Rectangle();
                System.out.println("Area of rectangle: " + rect.area());
                break;
            case 2:
                Square sq = new Square();
                System.out.println("Area of square: " + sq.area());
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



