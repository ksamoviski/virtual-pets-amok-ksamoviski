package shelter;

public abstract class LivingPet {
    protected String petId;
    protected String name;
    protected String characteristics;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public LivingPet(String petId, String name, String characteristics, int hungerLevel,
                     int thirstLevel, int boredomLevel) {
        this.petId = petId;
        this.name = name;
        this.characteristics = characteristics;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getHungerLevel(){
        return hungerLevel;
    }

    public int getThirstLevel(){
        return hungerLevel;
    }

    public int getBoredomLevel(){
        return boredomLevel;
    }

    public String getName(){
        return name;
    }

    public String getCharacteristics(){
        return characteristics;
    }

    public void feed(){
        hungerLevel -=10;
    }

    public void water(){
        hungerLevel -=10;
    }

    public void play(){
        boredomLevel -=10;
    }


}
