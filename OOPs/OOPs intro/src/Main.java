import java.util.*;



public class Main {
    public static class Person{
        String name;
        int age;

        void saysHi(){
            System.out.println(name+"["+age+"] Hi!!!");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "Rahul";
        p1.saysHi();


        Person p2 = new Person();
        p2.age = 10;
        p2.name = "Lol";
        p2.saysHi();

        /*
        * p1 and p2 are not object exactly; they are reference of an object.
        *       Stack                          |               Heap
        * p1(lets say store the address 4k)    |        |-> name: Rahul| at address 4k; created using tamplate provided by Person
        *             Reference                |        |-> age: 23| ~> Instance of p1(Can be called actual Object; occupies memory)
        * -----------------------------------------------------------------------------------
        * p2(lets say store the address 5k)    |        |-> name: Lol| at address 5k
         *                                     |        |-> age: 10|
        * */

         Person p3 = p1;  // Copies the reference, rather than creating a new object.
         p3.saysHi();

        // Chnaging age;
        p3.age = 20;
        p3.saysHi();

        p1.saysHi();
    }
}