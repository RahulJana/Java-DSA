import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print output
        System.out.println("Hello world!");
        System.out.print("yo!!!");
        System.out.print("\n");

        // taking input
        Scanner scn = new Scanner(System.in);
        // taking Integer input
//        int i = scn.nextInt();
//        System.out.println(i);

        // taking string input
        /*
        * If we are using both int and string in the same program
        * we have to use--> Integer.parseInt(scn.nextLine())
        * cuz Java is shit!!!
        * */
        int i = Integer.parseInt(scn.nextLine());  // basically type casting string into int.
        String name = scn.nextLine();
        System.out.println("Hello " + name+ " "+ i);
    }
}