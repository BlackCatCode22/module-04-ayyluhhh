package myZoo;

public class Animal {

    // myZoo.Animal Class
    private String animalName;

    private String species;

    private int age;

    // Create a static attribute that belongs to the animal class
    public static int numofAnimals = 0;

    // myZoo.Animal Class constructors

    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new myZoo.Animal object was created.\n");

        //create intial values for the class
        animalName = name;
        species = aSpecies;
        age = anAge;
        numofAnimals++;
    }
    public Animal() {
        System.out.println("\n A new myZoo.Animal object was created.\n");
        numofAnimals++;
    }
    public String getName() {
        return animalName;
    }
    public void setName(String name) {
        this.animalName = name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }
}
