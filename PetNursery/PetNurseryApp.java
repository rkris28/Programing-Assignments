package PetNursery;
import java.util.ArrayList;
import java.util.List;

// Parent class
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Subclass for puppies
class Puppy extends Animal {
    private String breed;

    public Puppy(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String toString() {
        return super.toString() + ", Breed: " + breed + " (Puppy)";
    }
}

// Subclass for kittens
class Kitten extends Animal{
    private String color;

    public Kitten(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String toString() {
        return super.toString() + ", Color: " + color + " (Kitten)";
    }
}

// Class to manage the nursery
class PetNursery {
    private List<Animal> pets;

    public PetNursery() {
        pets = new ArrayList<>();
    }

    public void addPet(Animal pet) {
        pets.add(pet);
    }

    public void printPetsInfo() {
        if (pets.isEmpty()) {
            System.out.println("No pets currently in the nursery.");
            return;
        }
        System.out.println("Current pets in the nursery:");
        for (Animal pet : pets) {
            System.out.println(pet);
        }
    }
}

// Main class to run the program
class PetNurseryApp {
    public static void main(String[] args) {
        PetNursery nursery = new PetNursery();

        // Adding some puppies and kittens to the nursery
        nursery.addPet(new Puppy("Buddy", 1, "Golden Retriever"));
        nursery.addPet(new Puppy("Charlie", 2, "Beagle"));
        nursery.addPet(new Kitten("Luna", 3, "Black"));
        nursery.addPet(new Kitten("Mittens", 1, "Yellow"));

        // Print information about all pets in the nursery
        nursery.printPetsInfo();
    }
}
