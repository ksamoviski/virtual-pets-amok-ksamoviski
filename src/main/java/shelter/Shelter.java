package shelter;

import java.util.HashMap;
import java.util.Map;

public class Shelter {

    Map<String, ShelterPet> petList = new HashMap<>();
    private int patientId;

    public void add(Dog dog) {
        petList.put(dog.getPetId(), dog)
    }

    public Dog findPet(String s) {
        return null;
    }
}
