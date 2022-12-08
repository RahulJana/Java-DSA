/*
* Dynamic arrays:
* */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al+"; Size -> "+ al.size());

        al.add(1);
        al.add(2);
        al.add(10);
        System.out.println(al+"; Size -> "+ al.size());

        // Adding new value in between
        al.add(1, 100);
        System.out.println(al);

        // getting value
        int val = al.get(1);
        System.out.println(val);

        // Changing value
        al.set(1, 200);
        System.out.println(al);

        // Removing values
        al.remove(1);
        System.out.println(al);

    }
}