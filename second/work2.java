package homework.second;

class Vehicle {
    private String brand;
    private String color;
    private int speed;
    private int wheels;

    public Vehicle(String brand, String color, int speed, int wheels) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
    }

    public void start() {
        System.out.println(brand + " is started");
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println(brand + " is accelerating at speed " + this.speed + " km/h");
    }

    public void brake() {
        System.out.println(brand + " is braking");
    }
}

class Car extends Vehicle {
    private int loader;

    public Car(String brand, String color, int speed, int wheels, int loader) {
        super(brand, color, speed, wheels);
        this.loader = loader;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("This is a car, can carry " + loader + " people");
    }

    public void overloadCheck(int actualLoad) {
        if (actualLoad > loader) {
            System.out.println("This is a car, can carry " + loader + " people, overloaded!!");
        }
    }
}

class Truck extends Vehicle {
    private int loader;
    private double payload;

    public Truck(String brand, String color, int speed, int wheels, int loader, double payload) {
        super(brand, color, speed, wheels);
        this.loader = loader;
        this.payload = payload;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("This is a truck, can carry " + loader + " people");
    }

    public void loadCargo(double cargoWeight) {
        if (cargoWeight > payload) {
            System.out.println("This is a truck, can carry " + loader + " people, overloaded!!");
        } else {
            System.out.println("This is a truck, payload loaded: " + cargoWeight + "kg");
        }
    }
}

public class work2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 0, 4, 6);
        myCar.start();
        myCar.accelerate(60);
        myCar.brake();
        myCar.overloadCheck(3); // Testing overload check

        System.out.println("---------------------------------------");

        Truck myTruck = new Truck("Volvo", "Blue", 0, 6, 3, 5000);
        myTruck.start();
        myTruck.accelerate(50);
        myTruck.brake();
        myTruck.loadCargo(3000); // Testing cargo loading
    }
}
