package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboCatTest {

    RoboCat underTest = new RoboCat("Poke", "Empathetic",
            50,50,50, 50);

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
    public void shouldDecreaseStiffnessBy10WhenOiled(){
        underTest.oil();
        int currentStiffness = underTest.getStiffnessLevel();
        assertEquals (currentStiffness, 40);
    }
}
