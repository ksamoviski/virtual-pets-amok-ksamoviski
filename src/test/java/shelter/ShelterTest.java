package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    Shelter underTest = new Shelter();
    OrganicPet dog = new OrganicDog("Archer", "Lazy",  50, 50,50,50);
    OrganicCat cat = new OrganicCat("Fluffy", "Fat", 50, 50,50;
    RoboDog roboDog = new RoboDog("Dino", "Sassy", 50, 50);
    RoboCat roboCat = new RoboCat("Fred", "Smart", 50, 50);


    @Test
    public void shouldBeAbleToAddAnOrganicDog(){
        underTest.add(organicDog);
        OrganicPet foundOrganicDog = underTest.findOrganicPet("Archer");
        assertEquals("Archer", foundOrganicDog.getName());
    }
}
