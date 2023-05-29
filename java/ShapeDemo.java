class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
    
    public void erase() {
        System.out.println("Erasing shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing triangle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing square");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        
        // Demonstrate runtime polymorphism
        Shape[] shapes = {shape, circle, triangle, square};
        for (Shape s : shapes) {
            s.draw();
            s.erase();
            System.out.println();
        }
    }
}
