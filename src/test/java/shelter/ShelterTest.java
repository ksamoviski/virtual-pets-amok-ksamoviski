package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    Shelter underTest = new Shelter();
    LivingPet dog = new Dog("1", "Archer", "Lazy", 50,50,50,50);
    Cat cat = new Cat("2", "Fluffy", "Fat", 50,50,50);
    RoboDog roboDog = new RoboDog("3", "Dino", "Smart", 50,50,50,50);
    RoboCat roboCat = new RoboCat("4", "Fred", "Shiny", 50,50,50, 50);

    @Test
    public void shouldBeAbleToAddADog(){
        underTest.add(dog);
        LivingPet foundDog = underTest.findPet("1");
        assertEquals("pet name", foundDog.getName());
    }
}
