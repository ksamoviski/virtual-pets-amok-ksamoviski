package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    Dog underTest = new Dog("2", "Archer", "Lazy",50,50,50, 50);

    @Test
    public void shouldDecreaseHungerBy10WhenFed(){
        underTest.feed();
        int currentHunger = underTest.getHungerLevel();
        assertEquals (currentHunger, 40);
    }

    @Test
    public void shouldDecreaseThirstBy10WhenWatered(){
        underTest.water();
        int currentThirst = underTest.getThirstLevel();
        assertEquals (currentThirst, 40);
    }

    @Test
    public void shouldDecreaseBoredomBy10WhenPlayed(){
        underTest.play();
        int currentBoredom = underTest.getBoredomLevel();
        assertEquals (currentBoredom, 40);
    }

    @Test
    public void shouldDecreaseEnergyBy10WhenWalked(){
        underTest.walk();
        int currentEnergy = underTest.getEnergyLevel();
        assertEquals (currentEnergy, 40);
    }



}
