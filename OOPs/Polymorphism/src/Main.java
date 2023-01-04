class Bike{
    String modelName;
    String brand;
    String color;
    int engine;

    public void isWorking(){
        System.out.println("Working...");
    }

    // Function overloading.
    public void details(){
        System.out.println("Details:");
        System.out.println(this.modelName+" "+this.engine+" "+this.brand+" "+this.color);
    }

    public void details(String modelName, String color){
        System.out.println("Details:");
        System.out.println(modelName + " " + color);
    }


}

class Rider{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name + " " + this.age);
    }

    public void hasLicense(){
        if(this.age > 21){
            System.out.println("Have License");
        } else {
            System.out.println("Don't have License");
        }
    }

    Rider(){  // Non-Parameterized constructor.
        System.out.println("---------------------------------------------");
        System.out.println("Non-Parameterized Rider() constructor is called!!!");
    }

    Rider(String name, int age){  // Parameterized constructor.
        System.out.println("---------------------------------------------");
        System.out.println("Parameterized Rider() constructor is called!!!");
        this.name = name;
        this.age = age;
    }

    Rider(Rider referenceObject){  // Copy constructor. Copies the data of one object to another.
        System.out.println("---------------------------------------------");
        System.out.println("Copy constructor Rider() is called.");
        this.name = referenceObject.name;
        this.age = referenceObject.age;
    }
}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Bike classic = new Bike();
        classic.modelName = "Classic";
        classic.brand = "Royal Enfield";
        classic.color = "Black";
        classic.engine = 350;

        classic.isWorking();

        Rider rahul = new Rider();  // Creating using Non-Parameterized constructor.
        rahul.name = "Rahul";
        rahul.age = 23;
        rahul.printInfo();
        rahul.hasLicense();

        Rider john = new Rider("John", 30);  // Creating using Parameterized constructor.
        john.hasLicense();
        john.printInfo();

        // Methode Overloading
        System.out.println("--------------Methode Overloading-------------");
        classic.details(classic.modelName, classic.color);
        classic.details();

    }
}