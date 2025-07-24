package Abstraction;
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}
interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}
class Car implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message();  
        FourWheeler.super.message(); 
        System.out.println("Inside Car");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Car car = new Car();
        car.message(); 
    }
}

