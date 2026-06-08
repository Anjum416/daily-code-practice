package Abstraction;

abstract class Vehicle {
    void buy() {
        System.out.println("This is TestRide");
    }

    void price() {
        System.out.println("This is car ride");
    }
}

class Car extends Vehicle {
    void model() {
        System.out.println("Car model: BMW");
    }
}

public class AbstractExample {
    public static void main(String args[]){
        Car t = new Car();
        t.buy();
        t.price();
        t.model();
    }
}
