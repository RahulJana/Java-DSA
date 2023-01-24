import java.util.*;

public class Main {
    private static class Node {
        int data; // Data on the node/leaf
        ArrayList<Node> children = new ArrayList<>(); // As a parent node can have n-number of children.
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for(Node child: node.children){
            str += child.data + ", ";  // Looping through the 
        }
        str += "-1 ";
        System.out.println(str);
        for(Node child: node.children){
            display(child);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node(); // Created a new node.
                t.data = arr[i]; // Initialized the node.data.
                if (st.size() > 0) { // When stack has members
                    st.peek().children.add(t);
                    /*
                     * st.peek() -> Top element of the stack, which is of Node DataType.
                     * So, st has two attribute data(INTEGER) and children(ARRAYLIST).
                     * st.peek().children.add(t) -> Adds the t as new Node, which is a children
                     */
                } else {
                    root = t; // initializing the Root
                }
                st.push(t); // Pushing the element into the stack.
            }
        }
        display(root);
    }
}
