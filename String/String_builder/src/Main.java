public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // Changing character at a specific location
        sb.setCharAt(0, 'x'); //<- Character has to be single quoted. And single character replaces single character of the string.
        System.out.println(sb);

//        System.out.println(sb.getChars(0, 4);
        sb.insert(2, 'y');
        System.out.println(sb);

    }
}