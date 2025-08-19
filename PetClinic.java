import java.util.Scanner;

interface Pet {
    String makeSound();
    String play();
}

class Dog implements Pet {
    private String breed;
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public String makeSound() {
        return "Aw! aw!";
    }
    
    @Override
    public String play() {
        return "Catch and fetch";
    }
}

class Cat implements Pet {
    private int noOfLives;
    
    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
    
    @Override
    public String makeSound() {
        return "Meow! Meow!";
    }
    
    @Override
    public String play() {
        return "Climb and scratch!";
    }
}

class PetRecord {
    private String petID;
    private String petName;
    private Pet pet;
    
    public void setPetID(String petID) {
        this.petID = petID;
    }
    
    public String getPetID() {
        return petID;
    }
    
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    public String getPetName() {
        return petName;
    }
    
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public Pet getPet() {
        return pet;
    }
}

public class PetClinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose pet");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Enter number choice: ");
            
            int choice = input.nextInt();
            input.nextLine();
            
            PetRecord petRecord = new PetRecord();
            
            switch (choice) {
                case 1:
                    petRecord.setPetID("P001");
                    petRecord.setPetName("Bantay");
                    Dog dog = new Dog();
                    dog.setBreed("Aspin");
                    petRecord.setPet(dog);
                    break;
                    
                case 2:
                    petRecord.setPetID("P002");
                    petRecord.setPetName("Muning");
                    Cat cat = new Cat();
                    cat.setNoOfLives(9);
                    petRecord.setPet(cat);
                    break;
                    
                case 3:
                    System.out.println("Goodbye!");
                    input.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            System.out.println("\nPet ID: " + petRecord.getPetID());
            System.out.println("Pet name: " + petRecord.getPetName());
            System.out.println("Sound: " + petRecord.getPet().makeSound());
            System.out.println("Play: " + petRecord.getPet().play());
        }
    }
}
