package shelter;

import java.util.Scanner;

public class ShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        OrganicDog archer = new OrganicDog("Archer", "Lazy", 50, 50, 50, 50);
        OrganicDog simon = new OrganicDog("Simon", "Grouchy", 50,50,50, 50);
        OrganicCat fluffy = new OrganicCat("Fluffy", "Fat", 50, 50, 50);
        OrganicCat poke = new OrganicCat("Poke", "Goofy", 50, 50, 50);
        RoboDog dino = new RoboDog("Dino", "Sassy", 50, 50);
        RoboDog tank = new RoboDog("Tank", "Extra Large", 50, 50);
        RoboCat fred = new RoboCat("Fred", "Smart", 50, 50);
        RoboCat dot = new RoboCat("Dot", "Smart", 50, 50);

        Shelter myShelter = new Shelter();
        String userChoice;

        myShelter.add(archer);
        myShelter.add(simon);
        myShelter.add(fluffy);
        myShelter.add(poke);
        myShelter.add(dino);
        myShelter.add(tank);
        myShelter.add(fred);
        myShelter.add(dot);

        System.out.println("Welcome to my Pet Shelter!");


    }

}

