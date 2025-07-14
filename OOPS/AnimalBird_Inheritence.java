package Oops;

class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
    public void sleep() {
        System.out.println("Animal sleeps");
    }
}
class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Bird eats seeds");
    }
    @Override
    public void sleep() {
        System.out.println("Bird sleeps in a nest");
    }
    public void fly() {
        System.out.println("Bird flies in the sky");
    }
}
public class AnimalBird_Inheritence {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal:");
        animal.eat();
        animal.sleep();
        System.out.println();
        Bird bird = new Bird();
        System.out.println("Bird:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
