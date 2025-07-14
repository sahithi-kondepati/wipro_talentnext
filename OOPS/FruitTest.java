package Oops;

public class FruitTest {
    static class Fruit {
        String name;
        String taste;
        String size;
        public Fruit(String name, String taste, String size) {
            this.name = name;
            this.taste = taste;
            this.size = size;
        }
        public void eat() {
            System.out.println("Fruit Name: " + name + ", Taste: " + taste);
        }
    }
    static class Apple extends Fruit {
        public Apple(String name, String taste, String size) {
            super(name, taste, size);
        }
        @Override
        public void eat() {
            System.out.println("Apple tastes sweet and crisp.");
        }
    }
    // Derived class Orange
    static class Orange extends Fruit {
        public Orange(String name, String taste, String size) {
            super(name, taste, size);
        }
        @Override
        public void eat() {
            System.out.println("Orange tastes tangy and juicy.");
        }
    }
    public static void main(String[] args) {
        Fruit f = new Fruit("Generic Fruit", "Mixed", "Medium");
        f.eat();
        Apple apple = new Apple("Apple", "Sweet", "Medium");
        apple.eat();
        Orange orange = new Orange("Orange", "Tangy", "Small");
        orange.eat();
    }
}

