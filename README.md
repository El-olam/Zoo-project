# Zoo Management Project

## 1. Encapsulation 
* File: Animal.java
* Notes: 'name' and 'age' are private. They use public getters and setters to keep the data safe.

## 2. Inheritance
* Files: Mammal.java and Bird.java
* Notes: Both use 'extends Animal' to share the same basic traits without repeating code.

## 3. Overriding (Polymorphism)
* Files: Mammal.java and Bird.java
* Notes: Both have their own custom version of the 'makeSound' method.

## 4. Overloading (Polymorphism)
* File: Animal.java
* Notes: There are two 'feed' methods. One takes no arguments, and the other takes a specific text string.