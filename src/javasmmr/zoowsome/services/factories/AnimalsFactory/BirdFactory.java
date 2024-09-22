package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class BirdFactory extends SpeciesFactory {

//    @Override
//    public Animals getAnimal(String type) {
//        if (Constants.Animals.Bird.Chicken.equals(type)) {
//            return new Chicken();
//        } else if (Constants.Animals.Bird.BlueJay.equals(type)) {
//            return new BlueJay();
//        } else if (Constants.Animals.Bird.Parrot.equals(type)) {
//            return new Parrot();
//        } else {
//            throw new RuntimeException("Invalid animal exception!");
//        }
//    }

    // Zoo (part 1) - 3.3
    @Override
    public Animals getAnimal(String type) {
        if (Constants.Animals.Bird.Chicken.equals(type)) {
            return new Chicken(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomMigrates(),RandomAnimalAttributes.randomFlightAltitude());
        } else if (Constants.Animals.Bird.BlueJay.equals(type)) {
            return new BlueJay(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomMigrates(),RandomAnimalAttributes.randomFlightAltitude());
        } else if (Constants.Animals.Bird.Parrot.equals(type)) {
            return new Parrot(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomMigrates(),RandomAnimalAttributes.randomFlightAltitude());
        } else {
            throw new RuntimeException("Invalid bird type!");
        }
    }
}
