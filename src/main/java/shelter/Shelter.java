package shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {

    Map<String, OrganicPet> pets = new HashMap<>();

    private int petId;

    public void add(OrganicPet petToAdd) {
        pets.put(petToAdd.getPetId(), petToAdd);
    }

    public OrganicPet findOrganicPet(String petName) {
        return pets.get(petName);
    }
}
