package shelter;

public class OrganicDog extends OrganicPet {

    private int energyLevel;


    public OrganicDog(String name, String characteristics, int hungerLevel, int thirstLevel, int boredomLevel, int energyLevel) {
        super(name, characteristics, hungerLevel, thirstLevel, boredomLevel);

        this.energyLevel = energyLevel;
    }


    public int getEnergyLevel() {
        return energyLevel;
    }

    public void walk() {
       energyLevel -=10;
    }

}
