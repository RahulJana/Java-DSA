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
        int temp_age = psn1.age;
        psn1.age = psn2.age;
        psn2.age = temp_age;

//        String temp_name = psn1.name;
//        psn1.name = psn2.name;
//        psn2.name = temp_name;

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
        * OG values have changed cause we changed the vlaues stored
        * in the HEAP; which affects the values outside.
        * */

    }
}