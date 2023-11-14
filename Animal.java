abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

abstract class Mammal extends Animal {
    int age;
    abstract void giveBirth();
}

class Dog extends Mammal {
    void giveBirth() {
        System.out.println("Dog gives birth");
    }
    void eat() {
        System.out.println("Dog eats");
    }
    void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.giveBirth();
        dog.eat();
        dog.sleep();
    }
}
