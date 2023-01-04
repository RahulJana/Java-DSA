# Question

Interface can extend into Interface
Interface can be implemented into Class

Lets say I create one interface and it has a property which has to present in all the class(Who are implementing the interface.).  How can I declare a property/some logic in a interface(Parent) and use that in all the classes using a function/method, Cause it can be done using a variable/data member.

```java
interface Animal{
    void walk();
}

interface Herbivore{
    String food = "plant based products";
    void eatPlants();
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Walks on four legs.");
    }
    public void eatPlants(){
        System.out.println(food+"Eats grass and leaf");
    }
}

interface Bird extends Animal {
        void haveFeathers();
}

class Pigeon implements Bird, Herbivore{
    public void haveFeathers(){
        System.out.println("Have feathers.");
    }
    public void walk(){
        System.out.println("walks on 2 legs");
    }
    public void eatPlants(){
        System.out.println("Eats grass, plant product.");
    }
}
```

lets say I want to use

```java
public void eatPlants(){
        System.out.println("Eats grass and leaf");
    }
```

inside `Herbivore` interface so that next time I can simply call that methode instead of rewriting in other child classes.

## Well I dont know

---

## Nested function

```java
public class Main
{
    public static int x = 10;
    
    public static int fn1(){
        if(x == 10){
            System.out.println("10");
            return 1;
        }
        return -1;
    }
    
    public static int fn2(){
        return fn1();
        // System.out.println("in fn 2");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int abc = fn2();
        System.out.println(abc);
    }
}
```


## How can I use checkEmpty() inside getFirst, getLast, getAt

```java
   
    public int checkEmpty(){
        if(size == 0){
          System.out.println("List is empty")
          return -1;
      }
    }
    public int getFirst(){
      // write your code here
      return checkEmpty();
      return head.data;
    }

    public int getLast(){
      // write your code here
      checkEmpty();
      return tail.data;
    }

    public int getAt(int idx){
      // write your code here
      checkEmpty();
      int counter = 0;
      if(idx >= size || idx < 0){
          System.out.println("Invalid arguments")
          return -1;
      }
      Node temp = head;
      for(int i = 0; i < idx; i++){
          temp = temp.next;
      }
      return temp.data;
    }
```
