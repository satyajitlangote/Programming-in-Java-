//3.	Hierarchical inheritance
class Vehicle {
    public void start() {
        System.out.println("The vehicle starts.");
    }
}
class Car extends Vehicle {
    public void drive() {
        System.out.println("The car drives.");
    }
}
class Bike extends Vehicle {
    public void ride() {
        System.out.println("The bike rides.");
    }
}
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.start();   
        car.drive();   

        Bike bike = new Bike();
        bike.start(); 
        bike.ride();  
    }
}
