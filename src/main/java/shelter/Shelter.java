package shelter;


import java.util.ArrayList;
import java.util.Collection;
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

    public Collection<ShelterPet> getAllPets() {
        return petList.values();
    }

    public Collection<ShelterPet> getOrganicPets() {
        Collection<ShelterPet> organicPets = new ArrayList<>();
        for (ShelterPet pet : petList.values()) {
            if (pet instanceof OrganicPet) {
                organicPets.add(pet);
            }
        }
        return organicPets;
    }

    public Collection<ShelterPet> getRoboPets() {
        Collection<ShelterPet> roboPets = new ArrayList<>();
        for (ShelterPet pet : petList.values()){
            if (pet instanceof RoboPet){
                roboPets.add(pet);
            }
        }
        return roboPets;
    }

    public void remove(ShelterPet shelterPetToRemove) {
        petList.remove(shelterPetToRemove.getName(), shelterPetToRemove);

    }


}

