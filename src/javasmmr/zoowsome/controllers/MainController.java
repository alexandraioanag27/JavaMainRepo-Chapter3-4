package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.AnimalsFactory.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.AnimalsFactory.SpeciesFactory;
import javasmmr.zoowsome.services.factories.EmployeesFactory.CaretakerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainController {

    public static void main(String[] args) {
        // Zoo (part 1) - 3.1

//        AnimalFactory abstractFactory = new AnimalFactory();
//        SpeciesFactory speciesFactory1 =
//                abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
//        Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammal.Tiger);
//        System.out.printf("We have an animal with %d legs!\n”, a1.getNrOfLegs());

        // Zoo (part 1) - 3.2

//        AnimalFactory abstractFactory = new AnimalFactory();
//        Random random = new Random();
//
//        int animalCount = 50;
//
//        for (int i = 0; i < animalCount; i++) {
//
//            int speciesChoice = random.nextInt(5);
//            SpeciesFactory speciesFactory;
//
//            switch (speciesChoice) {
//                case 0:
//                    speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
//                    break;
//                case 1:
//                    speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
//                    break;
//                case 2:
//                    speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
//                    break;
//                case 3:
//                    speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
//                    break;
//                case 4:
//                    speciesFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
//                    break;
//                default:
//                    throw new IllegalArgumentException("Invalid species choice!");
//            }
//
//
//            int animalChoice = random.nextInt(3);
//            Animals animal;
//
//            switch (speciesChoice) {
//                case 0: // Mammals
//                    switch (animalChoice) {
//                        case 0:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Mammal.Tiger);
//                            break;
//                        case 1:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Mammal.Monkey);
//                            break;
//                        case 2:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Mammal.Cow);
//                            break;
//                        default:
//                            throw new IllegalArgumentException("Invalid mammal choice!");
//                    }
//                    break;
//                case 1:
//                    switch (animalChoice) {
//                        case 0:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Reptile.Lizzard);
//                            break;
//                        case 1:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Reptile.Snake);
//                            break;
//                        case 2:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Reptile.Snake);
//                            break;
//                        default:
//                            throw new IllegalArgumentException("Invalid reptile choice!");
//                    }
//                    break;
//                case 2:
//                    switch (animalChoice) {
//                        case 0:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Bird.BlueJay);
//                            break;
//                        case 1:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Bird.Parrot);
//                            break;
//                        case 2:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Bird.Chicken);
//                            break;
//                        default:
//                            throw new IllegalArgumentException("Invalid bird choice!");
//                    }
//                    break;
//                case 3:
//                    switch (animalChoice) {
//                        case 0:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Aquatic.Squid);
//                            break;
//                        case 1:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Aquatic.Octopus);
//                            break;
//                        case 2:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Aquatic.Jellyfish);
//                            break;
//                        default:
//                            throw new IllegalArgumentException("Invalid aquatic choice!");
//                    }
//                    break;
//                case 4:
//                    switch (animalChoice) {
//                        case 0:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Insect.Butterfly);
//                            break;
//                        case 1:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Insect.Spider);
//                            break;
//                        case 2:
//                            animal = speciesFactory.getAnimal(Constants.Animals.Insect.Cockroach);
//                            break;
//                        default:
//                            throw new IllegalArgumentException("Invalid insect choice!");
//                    }
//                    break;
//                default:
//                    throw new IllegalArgumentException("Invalid species choice!");
//            }
//
//            System.out.printf("Created a %s with %d legs!%n", animal.getName(), animal.getNrOfLegs());
//        }

        // Zoo (part 1) - 3.3

//        try {
//            AnimalFactory abstractFactory = new AnimalFactory();
//
//            SpeciesFactory mammalFactory = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
//            Animals tiger = mammalFactory.getAnimal(Constants.Animals.Mammal.Tiger);
//            System.out.printf("Created a %s with %d legs!%n", tiger.getName(), tiger.getNrOfLegs());
//
//            SpeciesFactory reptileFactory = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
//            Animals lizzard = reptileFactory.getAnimal(Constants.Animals.Reptile.Lizzard);
//            System.out.printf("Created a %s with %d legs!%n", lizzard.getName(), lizzard.getNrOfLegs());
//
//            SpeciesFactory birdFactory = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
//            Animals chicken = birdFactory.getAnimal(Constants.Animals.Bird.Chicken);
//            System.out.printf("Created a %s with %d legs!%n", chicken.getName(), chicken.getNrOfLegs());
//
//            SpeciesFactory insectFactory = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
//            Animals butterfly = insectFactory.getAnimal(Constants.Animals.Insect.Butterfly);
//            System.out.printf("Created a %s with %d legs!%n", butterfly.getName(), butterfly.getNrOfLegs());
//
//            SpeciesFactory aquaticFactory = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
//            Animals squid = aquaticFactory.getAnimal(Constants.Animals.Aquatic.Squid);
//            System.out.printf("Created a %s with %d legs!%n", squid.getName(), squid.getNrOfLegs());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Zoo (part 2) - 4.1

        List<Animals> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Parrot());
        animals.add(new Snake());
        animals.add(new Crocodile());
        animals.add(new Butterfly());

        List<Caretaker> caretakers = new ArrayList<>();
        caretakers.add(new Caretaker("John", new BigDecimal("3000"), 8.0));
        caretakers.add(new Caretaker("Alice", new BigDecimal("3200"), 6.5));
        caretakers.add(new Caretaker("Bob", new BigDecimal("2900"), 7.0));

        for (Caretaker caretaker : caretakers) {
            for (Animals animal : animals) {
                if (!caretaker.isDead() && !animal.isTakenCareOf()) {
                    String result = caretaker.takeCareOf(animal);
                    if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
                        caretaker.setDead(true);
                        System.out.println(caretaker.getName() + " was killed by " + animal.getClass().getSimpleName());
                        break;
                    } else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
                        System.out.println(caretaker.getName() + " did not have enough time to take care of " + animal.getClass().getSimpleName());
                        continue;
                    } else {
                        animal.setTakenCareOf(true);
                        System.out.println(caretaker.getName() + " successfully took care of " + animal.getClass().getSimpleName());
                    }
                }
            }
        }

        boolean allTakenCareOf = true;
        for (Animals animal : animals) {
            if (!animal.isTakenCareOf()) {
                allTakenCareOf = false;
                System.out.println(animal.getClass().getSimpleName() + " has not been taken care of.");
            }
        }

        if (allTakenCareOf) {
            System.out.println("All animals have been taken care of.");
        } else {
            System.out.println("Not all animals have been taken care of.");
        }

        // Chapter 4 - 4.2

        System.out.println("\nAnd now for the twist!!!");

        Animals spider = new Spider();

        if (spider.kill()) {
            System.out.println("The spider killed the caretaker.");
        } else {
            System.out.println("The spider did not kill the caretaker.");
        }

        Animals tiger = new Tiger();

        if (tiger.kill()) {
            System.out.println("The tiger killed the caretaker.");
        } else {
            System.out.println("The tiger did not kill the caretaker.");
        }

        Animals snake = new Snake();

        if (snake.kill()) {
            System.out.println("The snake killed the caretaker.");
        } else {
            System.out.println("The snake did not kill the caretaker.");
        }

        Animals crocodile = new Crocodile();

        if (crocodile.kill()) {
            System.out.println("The crocodile killed the caretaker.");
        } else {
            System.out.println("The crocodile did not kill the caretaker.");
        }


    }
}
