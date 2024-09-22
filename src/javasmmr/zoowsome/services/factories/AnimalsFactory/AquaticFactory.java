package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AquaticFactory extends SpeciesFactory {

//    @Override
//    public Animals getAnimal(String type) {
//        if (Constants.Animals.Aquatic.Jellyfish.equals(type)) {
//            return new Jellyfish();
//        } else if (Constants.Animals.Aquatic.Octopus.equals(type)) {
//            return new Octopus();
//        } else {
//            if (Constants.Animals.Aquatic.Squid.equals(type)) {
//                return new Squid();
//            } else {
//                throw new RuntimeException("Invalid aquatic animal exception!");
//            }
//        }
//    }

    // Zoo (part 1) - 3.3

    @Override
    public Animals getAnimal(String type) {
        if (Constants.Animals.Aquatic.Jellyfish.equals(type)) {
            return new Jellyfish(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomSwimDepth(), RandomAnimalAttributes.randomWaterType());
        } else if (Constants.Animals.Aquatic.Octopus.equals(type)) {
            return new Octopus(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomSwimDepth(), RandomAnimalAttributes.randomWaterType());
        } else if (Constants.Animals.Aquatic.Squid.equals(type)) {
            return new Squid(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomSwimDepth(), RandomAnimalAttributes.randomWaterType());
        } else {
            throw new RuntimeException("Invalid aquatic animal type!");
        }
    }
}
