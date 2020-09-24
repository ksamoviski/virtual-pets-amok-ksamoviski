package shelter;

public class Dog extends LivingPet {


    public Dog(String name, String characteristics, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, characteristics, hungerLevel, thirstLevel, boredomLevel);
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


//    don't forget walk method
}
