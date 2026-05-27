package Zoo;

import java.util.*;

public class ZooApplication {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<> ();
        zoo.add(new Mammal("Leo", 5, "Gold"));
        zoo.add(new Bird("Pip", 2, 0.5));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Sounds | 2. Feed | 3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                for (Animal a : zoo) a.makeSound();
            } else if (choice == 2) {
                for (Animal a : zoo) a.feed("Apple");
            } else {
                break;
            }
        }
        scanner.close();
    }
}