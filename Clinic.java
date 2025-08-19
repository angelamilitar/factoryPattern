import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose pet");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Enter number choice: ");
            
            int choice = input.nextInt();
            input.nextLine(); // Consume newline
            
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