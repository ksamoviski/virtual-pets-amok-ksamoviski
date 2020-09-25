package shelter;

public class ShelterPet { ;
    protected String name;
    protected String characteristics;

    public String getName(){
        return name;
    }
    public String getCharacteristics(){
        return characteristics;
    }

    public ShelterPet(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }


}
