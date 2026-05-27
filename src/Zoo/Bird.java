package Zoo;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() { System.out.println(getName() + " chirps: *Tweet!*"); }
}
