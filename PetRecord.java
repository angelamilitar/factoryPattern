public class PetRecord {
    private String petID;
    private String petName;
    private Pet pet;
    
    public PetRecord() {
    }
    
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