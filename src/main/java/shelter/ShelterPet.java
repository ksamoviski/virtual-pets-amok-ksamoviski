package shelter;

public abstract class ShelterPet {

    protected String petId;
    protected String name;

    public String getName(){
        return name;
    }

    public String getPetId(){
        return petId;
    }

    public ShelterPet(String petId, String name){
        this.petId = petId;
        this.name = name;
    }




}
