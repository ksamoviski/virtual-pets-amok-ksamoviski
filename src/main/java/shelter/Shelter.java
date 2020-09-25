package shelter;


import java.util.HashMap;
import java.util.Map;

public class Shelter {

    Map<String, ShelterPet> petList = new HashMap<>();

    public void add(ShelterPet shelterPetToAdd) {
        petList.put(shelterPetToAdd.getName(), shelterPetToAdd);

    }

    public ShelterPet findPet(String name) {
        return (ShelterPet) petList.get(name);
    }
}
