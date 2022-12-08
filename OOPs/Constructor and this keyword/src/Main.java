import java.util.*;

public class Main {
    public static class Person{
        int age;
        String name;

        /*
        * Value of age and name is allocated based on the declaration of the variable.
        *
        * */

        void saysHi(){
            System.out.println(name + "[" + age + "]: says hi!!");
        }

        // non-parameterized Constructor
        Person(){

        }
        // Parameterized Constructor
        Person(int age, String name){
            this.age = age;
            this.name = name;


        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();  // Using Non-Parameterized constructor.
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();


        Person p2 = new Person(20, "B");  // Using Parameterized Constructor
        p2.saysHi();
    }
}