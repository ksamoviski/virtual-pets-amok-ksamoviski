package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    Shelter underTest = new Shelter();
    OrganicDog organicDog = new OrganicDog("Archer", "Lazy",  50, 50,50,50);
    OrganicCat organicCat = new OrganicCat("Fluffy", "Fat", 50, 50,50);
    RoboDog roboDog = new RoboDog("Dino", "Sassy", 50, 50);
    RoboCat roboCat = new RoboCat("Fred", "Smart", 50, 50);


    @Test
    public void shouldBeAbleToHireAnOrganicDog(){
        underTest.hire(organicDog);
        ShelterPet foundOrganicDog = underTest.findShelterPets("Archer");
        assertEquals("Archer", foundOrganicDog.getName());
    }

    }



