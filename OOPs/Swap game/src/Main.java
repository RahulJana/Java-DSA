// Important memory map concept.

import java.util.*;

public class Main{
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name + "[" + age + "] says hi");
        }
    }

    public static void swap_game(Person p1, Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;

        System.out.println("------------------------\nInside swap fn:");
        // swapping attributes.
        p1.saysHi();
        p2.saysHi();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "AA";
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "BB";
        p2.saysHi();

        // swap operation
        swap_game(p1, p2); // When we come out of swap function then the gets cleared so as the change in value.
        System.out.println("-------------------------");
        System.out.println("Outside swap");  // Thus outside swap fn values remains same.
        p1.saysHi();
        p2.saysHi();
    }
}
