package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class ReptileFactory extends SpeciesFactory {

//    @Override
//    public Animals getAnimal(String type) {
//        if (Constants.Animals.Reptile.Crocodile.equals(type)) {
//            return new Crocodile();
//        } else if (Constants.Animals.Reptile.Lizzard.equals(type)) {
//            return new Lizzard();
//        } else if (Constants.Animals.Reptile.Snake.equals(type)) {
//            return new Snake();
//        }else {
//            throw new RuntimeException("Invalid animal exception!");
//        }
//    }

    // Zoo (part 1) - 3.3
    @Override
    public Animals getAnimal(String type) {
        if (Constants.Animals.Reptile.Crocodile.equals(type)) {
            return new Crocodile(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomLaysEggs());
        } else if (Constants.Animals.Reptile.Lizzard.equals(type)) {
            return new Lizzard(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomLaysEggs());
        } else if (Constants.Animals.Reptile.Snake.equals(type)) {
            return new Snake(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomLaysEggs());
        } else {
            throw new RuntimeException("Invalid reptile type!");
        }
    }
}
