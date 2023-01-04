interface Animal{
    void walk();
}
interface Herbivore{
    String food = "plant based products";
    static void eatPlants(){
        System.out.println("plant based products");
    };
}
class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on four legs.");
    }
    public void eatPlants(){
        System.out.println(food+"Eats grass and leaf");
    }
}
interface Bird extends Animal {
        void haveFeathers();
}

class Pigeon implements Bird, Herbivore{
    public void haveFeathers(){
        System.out.println("Have feathers.");
    }
    public void walk(){
        System.out.println("walks on 2 legs");
    }
    public void eatPlants(){
        System.out.println("Eats grass, plant product.");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}