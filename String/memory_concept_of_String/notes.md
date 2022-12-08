In Java strings are immutable.
which means in the word "Hello"; we can't change any character.\
But when we write 
```
String s1 = "Hello"; // Lets say address is 4k.
s1 = "World";
```
In 2nd instance it did not rewrite/change the value of the string at 4k.\
Rather it created another string at a different location.\
It happens because of interning.

- Reference is mutable but instance is immutable
