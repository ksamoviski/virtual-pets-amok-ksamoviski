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

        do{System.out.println("Welcome to my Pet Shelter!");
        System.out.println();
        System.out.println("Press 1 to see our Living Pets");
        System.out.println("Press 2 to see our Robotic Pets");
        System.out.println("Press 9 to exit");
        userChoice = input.nextLine();

        if (userChoice.equals("1")){
            System.out.println("Great! You want to see our Living Pets");
            System.out.println("Here are our Living Pets");
            myShelter.getOrganicPets();

            System.out.println("Which pet would you like to feed?");
            String petName = input.nextLine();
            myOrganicPet.play();
            System.out.println("I'm getting sleepy...");
            System.out.println("Energy Level = " + myOrganicPet.getBoredomLevel());

        }else if(userChoice.equals("2")){
            System.out.println("Great! You want to see our Robotic Pets");
            System.out.println("Here are our Robotic Pets");
            myShelter.getRoboPets();

            System.out.println("Which pet would you like to feed?");
            String petName = input.nextLine();
            myRoboPet.play();
            System.out.println("I'm getting sleepy...");
            System.out.println("Energy Level = " + myRoboPet.getBoredomLevel());
        }
    } while (!userChoice.equals("9"));
        System.out.println("Thanks for banking with us today");
    }
}


