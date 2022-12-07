/*
* This is not a pure abstraction. Pure abstraction can be achieved by Interfaces
* */

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Eats.");
    }

    Animal(){
        System.out.println("Animal Constructor.");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Can walk on 4 leg.");
    }

    Horse(){
        System.out.println("Horse Constructor.");
    }
}

class Pigeon extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs.");
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Animal al = new Animal();  // We can not do this because Animal is an abstract class.
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }

}