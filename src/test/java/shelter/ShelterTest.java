package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelterTest {

    Shelter underTest = new Shelter();
    OrganicDog organicDog = new OrganicDog("Archer", "Lazy",  50, 50,50,50);
    OrganicCat organicCat = new OrganicCat("Fluffy", "Fat", 50, 50,50);
    RoboDog roboDog = new RoboDog("Dino", "Sassy", 50, 50);
    RoboCat roboCat = new RoboCat("Fred", "Smart", 50, 50);

    @Test
    public void shouldBeAbleToAddAnOrganicDog(){
        underTest.add(organicDog);
        ShelterPet foundOrganicDog = underTest.findPet("Archer");
        assertEquals("Archer", foundOrganicDog.getName());

    }

    @Test
    public void shouldBeAbleToAddAnOrganicDogAndOrganicCat(){
        underTest.add(organicDog);
        underTest.add(organicCat);
        ShelterPet foundOrganicDog = underTest.findPet("Archer");
        ShelterPet foundOrganicCat = underTest.findPet("Fluffy");
        assertEquals("Archer", foundOrganicDog.getName());
        assertEquals("Fluffy", foundOrganicCat.getName());
    }

    @Test
    public void shouldBeAbleToAddARoboDogAndRoboCat(){
        underTest.add(roboDog);
        underTest.add(roboCat);
        ShelterPet foundRoboDog = underTest.findPet("Dino");
        ShelterPet foundRoboCat = underTest.findPet("Fred");
        assertEquals("Dino", foundRoboDog.getName());
        assertEquals("Fred", foundRoboCat.getName());
    }

    @Test
    public void shouldBeAbleToAddACollectionOfPets(){
        underTest.add(organicDog);
        underTest.add(organicCat);
        underTest.add(roboDog);
        underTest.add(roboCat);
        Collection<ShelterPet> addedPets = underTest.getAllPets();
        assertThat(addedPets, containsInAnyOrder(organicDog,organicCat,roboCat,roboDog));
    }

    @Test
    public void shouldBeAbleToDisplayAllOrganicPets(){
        underTest.add(organicDog);
        underTest.add(organicCat);
        underTest.add(roboDog);
        underTest.add(roboCat);
        Collection<ShelterPet> organicPets = underTest.getOrganicPets();
        assertThat(organicPets, containsInAnyOrder(organicCat, organicDog));
    }

    @Test
    public void shouldBeAbleToDisplayAllRoboPets(){
        underTest.add(organicDog);
        underTest.add(organicCat);
        underTest.add(roboDog);
        underTest.add(roboCat);
        Collection<ShelterPet> roboPets = underTest.getRoboPets();
        assertThat(roboPets, containsInAnyOrder(roboCat, roboDog));
    }

    @Test
    public void shouldBeAbleToRemoveAnOrganicDog(){
        underTest.add(organicDog);
        underTest.remove(organicDog);
        ShelterPet foundOrganicDog = underTest.findPet("Archer");
        assertEquals(foundOrganicDog, null);

    }

    @Test
    public void shouldBeAbleToDisplayAllOrganicDogs(){
        underTest.add(organicDog);
        underTest.add(organicCat);
        underTest.add(roboDog);
        underTest.add(roboCat);
        Collection<ShelterPet> organicDogs = underTest.getOrganicDogs();
        assertThat(organicDogs, containsInAnyOrder(organicDogs));
    }

}



