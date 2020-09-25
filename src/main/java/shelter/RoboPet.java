package shelter;

public abstract class RoboPet extends ShelterPet {
    protected int boredomLevel;
    protected int stiffnessLevel;

    public RoboPet(String name, String characteristics, int boredomLevel, int stiffnessLevel){
        super(name, characteristics);
        this.boredomLevel = boredomLevel;
        this.stiffnessLevel = stiffnessLevel;
    }

    public int getBoredomLevel(){
        return boredomLevel;
    }

    public int getStiffnessLevel(){
        return stiffnessLevel;
    }

    public void play(){
        boredomLevel -=10;
    }

    public void oil() {
        stiffnessLevel -=10;
    }
}
