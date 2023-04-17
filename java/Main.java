class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private int numDoors;
    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("Number of doors: " + numDoors);
    }
}
class ElectricCar extends Car {
    private int batteryCapacity;
    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2022);
        vehicle.printDetails();
        Car car = new Car("Honda", "Civic", 2021, 4);
        car.printDetails();  
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2023, 4, 100);
        electricCar.printDetails();
    }
}
