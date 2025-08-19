public class Cat implements Pet {
    private int noOfLives;
    
    public Cat() {
    }
    
    public void setNoOfLives(int noOfLives) {
        this.noOfLives = noOfLives;
    }
    
    public int getNoOfLives() {
        return noOfLives;
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