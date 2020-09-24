package shelter;

public class Dog extends LivingPet {

    private int energyLevel;


    public Dog(String name, String characteristics, int hungerLevel,
               int thirstLevel, int boredomLevel, int energyLevel) {
        super(name, characteristics, hungerLevel, thirstLevel, boredomLevel);

        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    @Override
    public void feed(){
        hungerLevel -=10;
    }

    @Override
    public void water(){
        hungerLevel -=10;
    }

    @Override
    public void play(){
        boredomLevel -=10;
    }

    public void walk() {
       energyLevel -=10;
    }

}
