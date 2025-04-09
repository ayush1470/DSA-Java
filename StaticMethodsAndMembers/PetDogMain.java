class PetDog extends Dog {
    static int totalPetDogs = 0;
    String ownerName;

    PetDog(String name, int age, String breed, int size, String ownerName) {
        super(name, age, breed, size);
        this.ownerName = ownerName;
        totalPetDogs++;
    }

    static int getTotalPetDogs() {
        return totalPetDogs;
    }

    void displayOwnerDetails() {
        super.displayDetails();
        System.out.println("Owner Name: " + ownerName);
    }
}

public class PetDogMain {
    public static void main(String[] args) {
        PetDog petDog1 = new PetDog("Tommy", 5, "Labrador", 30, "Aman");
        PetDog petDog2 = new PetDog("Luna", 1, "Husky", 10, "Rahul");
        PetDog petDog3 = new PetDog("King", 3, "German Shepherd", 20, "Ayush");

        petDog1.displayOwnerDetails();
        petDog2.displayOwnerDetails();
        petDog3.displayOwnerDetails();

        System.out.println("Total Number of Dogs: " + Dog.getNumberOfDogs());
        System.out.println("Total Number of Pet Dogs: " + PetDog.getTotalPetDogs());
    }
}
