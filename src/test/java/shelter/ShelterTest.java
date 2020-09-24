package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    Shelter underTest = new Shelter();
    Cat cat = new Cat("1", "Silly", "Silly",50,50,50);
    Dog dog = new Dog("2", "George", "Tough Guy",50,50,50, 50);
    RoboCat roboCat = new RoboCat("Viola","Intelligent", 50, 50,50,50);
    RoboDog roboDog = new RoboDog("Charlie","Shiny",50,50,50,50);

    @Test
    public void shouldBeAbleToAddADog(){
        underTest.add(dog);
        Dog foundDog = underTest.findPet("1");
        assertEquals("pet name", foundDog.getName());
    }
}
