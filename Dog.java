public class Dog implements Pet {
    private String breed;
    
    public Dog() {
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
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