package shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {

    Map<String, LivingPet> pets = new HashMap<>();

    private int petId;

    public void add(LivingPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }


    public LivingPet findPet(String petName) {
        return pets.get(petName);
    }
}
