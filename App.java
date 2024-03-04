package myZoo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Zoo\n\n");
        System.out.println("\n Number of animals is: " + Animal.numofAnimals);

        // Local Variables
        String name;
        String species;
        int age;

        // ArrayList of myZoo.Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // Open an extnernal file, parse it line by line, and get age and species
        String filePath = "C:/Mac/Home/Downloads/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Age is the first element
                String[] parts = line.split( " ");

                // check if the line has atleast 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    System.out.println("ageAndSpecies: " + ageAndSpecies );

                    // Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split( " ");
                    for (int i=0; i<5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    // Create a new animal object
                    Animal myAnimal = new Animal("name needed", species,age);

                    // Add the new myZoo.Animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: " + Animal.numofAnimals);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
        // We now have an arrayList of animals.
        for (Animal animal : animals){
            System.out.println(animal);
            System.out.println("myZoo.Animal name: " + animal.getName() + ", Age: " + animal.getAge() + " Species: " + animal.getSpecies());
        }
        System.out.println("\n Number of animals is: " + Animal.numofAnimals);
    }
}