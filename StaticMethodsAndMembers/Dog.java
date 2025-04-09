public class Dog {
    String name;
    int age;
    String breed;
    int size;

    static int numberOfDogs = 0;

    Dog() {
    }

    Dog(String name, int age, String breed, int size) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
        numberOfDogs++;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
    }

    static int getNumberOfDogs() {
        return numberOfDogs;
    }

    static void resetDogCounter() {
        numberOfDogs = 0;
    }

    void eat() {
        System.out.println("Dog is eating");
    }

    void sleep() {
        System.out.println("Dog is sleeping");
    }

    void play() {
        System.out.println("Dog is playing.");
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}
