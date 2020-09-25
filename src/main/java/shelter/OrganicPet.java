package shelter;

public abstract class OrganicPet extends ShelterPet {
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public OrganicPet(String name, String characteristics, int hungerLevel,
                      int thirstLevel, int boredomLevel) {
        super(name, characteristics);
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
