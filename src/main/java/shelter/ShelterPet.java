package shelter;

public abstract class  ShelterPet { ;
    protected String name;
    protected String characteristics;


    public String getCharacteristics(){
        return characteristics;
    }

    public ShelterPet(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }


}
