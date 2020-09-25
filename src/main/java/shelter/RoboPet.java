package shelter;

public abstract class RoboPet {
    protected String name;
    protected String characteristics;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;
    protected int stiffnessLevel;

    public RoboPet(String petId, String name, String characteristics, int hungerLevel, int thirstLevel, int boredomLevel, int stiffnessLevel) {
        this.name = name;
        this.characteristics = characteristics;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.stiffnessLevel = stiffnessLevel;
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

    public int getStiffnessLevel(){
        return stiffnessLevel;
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

    public void oil() {
        stiffnessLevel -=10;
    }
}
