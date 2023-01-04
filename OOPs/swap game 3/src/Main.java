import java.util.Scanner;

public class Main {
    public static class Person{
        int age;
        String name;

        void saysHi(){
            System.out.println(name+"["+ age +"] says hi!!!");
        }
    }

    public static void swap2(Person psn1, Person psn2){
        System.out.println("-------------\nInside Swap fn:");
        psn1 = new Person();
        int temp_age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = temp_age;
        System.out.println("Age swap->");
        psn1.saysHi();
        psn2.saysHi();

        psn2 = new Person();
        String temp_name = psn1.name;
        psn1.name = psn2.name;
        psn2.name = temp_name;
        System.out.println("name ->");
        psn1.saysHi();
        psn2.saysHi();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Person p1 = new Person();
        System.out.println("------------\nStock:");
        p1.age = 10;
        p1.name = "AA";
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "BB";
        p2.saysHi();

        // calling swap
        swap2(p1, p2);
        System.out.println("------------------\nOutside Swap:");
        p1.saysHi();
        p2.saysHi();
        /*
         * If we create new objects and do not assign any values, then numbers(int, floats) become 0; and
         * string will become null.
         *
         * Here outside swap function only age is affected as in the first segment of the program have created a
         * copy of psn1 so the values of psn1 is not affected; but in the 2nd segment we have created a copy of psn2
         * so the change in name does not affect the psn2 's name attribute. But the age attribute gets affected by the
         *  1st segment of the code.
         *
         */

    }
}