# OOP

syntax:

```java
Class_name object_name = new Class_name();
```

Class_name object_name = new Class_name();

- `new` -> Allocates new memory in memory heap.
- `Class_name()` ->  Calling the default constructor of the class.

In Java user defines all the copy constructors.
In Java there is a garbage collector, which works as a `Destructor()` to remove unused objects and variables.

## Polymorphism

- Method Overloading:
    It is a compile-time polymorphism. Happens by creating functions with similar names but different parameters.

## Access Modifiers

There are 4 types of access modifiers:
    1. Public
    2. Private
    3. Protected
    4. Default

## Constructor chaining

```java
class Animal{
    Animal(){
        System.out.println("Animal constructor created.");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor created.");
    }
}
```

Output:

```Output:
Animal constructor created.
Horse constructor created.
```
