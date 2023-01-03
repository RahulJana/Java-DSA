/*
* When stack is full, and we are trying to push a new element instead of showing "Stack overflow";
* It will re-allocate double of size.
*
*
* */

import java.util.Scanner;


public class Main {

    public static class CustomStack{
        int[] data;
        int tos;

        public CustomStack(int cap){
            data = new int[cap];
            tos = -1;  // Top of the stack // tos == (-1) means it does not have any element.
        }

        void push(int val){
            if(tos == data.length-1){
//                System.out.println("Stack overflow.");
                int[] ndata = new int[2* data.length];
                for(int i = 0; i<data.length; i++){
                    ndata[i] = data[i];
                }
                data = ndata;
                tos++;
                data[tos] = val;
            }else{
                tos++;
                data[tos] = val;
            }
        }

        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow.");
                return -1;
            }else{
                int temp = data[tos];
                tos--;
                return temp;
            }
        }

        int peek(){
            if(tos == -1){
                System.out.println("Stack Unerflow");
                return -1;
            }else{
                return data[tos];
            }
        }

        int size(){
            return tos +1;
        }

        void display(){
            for(int i = tos; i>=0; i--){
                System.out.println(data[i] + " ");
            }
            System.out.println();  // Adding an empty line.
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CustomStack cst = new CustomStack(n);

    }
}