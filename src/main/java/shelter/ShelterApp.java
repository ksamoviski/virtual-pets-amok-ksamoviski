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
        System.out.println("Press 3 to feed a pet");
        System.out.println("Press 4 to give a pet a drink");
        System.out.println("Press 5 to play with a pet");
        System.out.println("Press 6 to take a dog for a walk");
        System.out.println("Press 7 to oil a pet");
        System.out.println("Press 8 to adopt a pet");
        System.out.println("Press 9 to drop off a per");
        System.out.println("Type exit to leave the game");
        userChoice = input.nextLine();

        if (userChoice.equals("1")){
            System.out.println("Great! You want to see our Living Pets");
            System.out.println("Here are our Living Pets");
            myShelter.getOrganicPets();

        }else if(userChoice.equals("2")){
            System.out.println("Great! You want to see our Robotic Pets");
            System.out.println("Here are our Robotic Pets");
            myShelter.getRoboPets();

        }else if(userChoice.equals("3")){
            System.out.println("Great! You want to feed one of our pets");
            System.out.println("Here are the pets that can be fed");
            myShelter.getOrganicPets();

            System.out.println("Which pet would you like to feed?");
            String petName = input.nextLine();
            myOrganicPet.feed();
            System.out.println("Thanks " + petName + " was hungry!");
            System.out.println("Energy Level = " + myOrganicPet.getHungerLevel());
        }

        else if(userChoice.equals("4")){
            System.out.println("Great! You want to give one of our pets a drink");
            System.out.println("Here are the pets that can have a drink");
            myShelter.getOrganicPets();

            System.out.println("Which pet would you like to give a drink to?");
            String petName = input.nextLine();
            myOrganicPet.water();
            System.out.println("Thanks " + petName + " was thirsty!");
            System.out.println("Thirst Level = " + myOrganicPet.getThirstLevel());
        }

        else if(userChoice.equals("5")){
            System.out.println("Great! You want to play with one of our pets");
            System.out.println("Here are the pets you can play with");
            myShelter.getAllPets();

            System.out.println("Which pet would you like to play with");
            String petName = input.nextLine();
            myShelterPets.play();
            System.out.println("Thanks " + petName + " needed some exercise!");
            System.out.println("Thirst Level = " + myShelterPet.getBoredomLevel());
        }

        else if(userChoice.equals("6")){
            System.out.println("Great! You want to walk one of our dogs");
            System.out.println("Here are the dogs that can go for walks");
            myShelter.getAllPets();

            System.out.println("Which dog would you like to walk?");
            String petName = input.nextLine();
            myOrganicDog.walk();
            System.out.println("Thanks " + petName + " needed some exercise!");
            System.out.println("Energy Level = " + myOrganicDog.getEnergyLevel());
        }

        else if(userChoice.equals("7")){
            System.out.println("Great! You want to oil a robotic pet!");
            System.out.println("Here are the dogs that can get oil");
            myShelter.getAllPets();

            System.out.println("Which robotic pet would you like to oil?");
            String petName = input.nextLine();
            myRoboticPets.oil();
            System.out.println("Thanks " + petName + " needed some oil!");
            System.out.println("Stiffness Level = " + myRoboticPet.getStiffnessLevel());
        }

        else if(userChoice.equals("8")){
            System.out.println("You want to adopt a pet");
            System.out.println("Here are our pets");
            myShelter.getShelterPets();

            System.out.println("Which pet would you like to adopt");
            String petName = input.nextLine();
            myShelter.remove(ShelterPet shelterPetToRemove);
            System.out.println("I can't wait to see my new home");

        }


        else if(userChoice.equals("9")){
            System.out.println("You want to drop off a pet");
            System.out.println("What is the name of your pet?");
            String petName = input.nextLine();
            myShelter.add(ShelterPet shelterPetToAdd);
            System.out.println("Sorry your pet didn't work out.");
        }

        } while (!userChoice.equals("exit"));
        System.out.println("Thanks for visiting the shelter today!");
    }
}

