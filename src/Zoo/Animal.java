package Zoo;

public class Animal {
private String name;
private int age;

public Animal(String name, int age) {
    setName(name);
    setAge(age);
}

public String getName() { return name; }
public void setName(String name) { this.name = (name != null) ? name : "unknown"; }
public int getAge() { return age; }
public void setAge(int age) { this.age = (age >= 0) ? age : 0; }

public void makeSound() { System.out.println("Generic animal sound."); }
public void feed() { System.out.println(name + " ate standard food."); }
public void feed(String treat) { System.out.println(name + " ate a " + treat + "!"); }
}