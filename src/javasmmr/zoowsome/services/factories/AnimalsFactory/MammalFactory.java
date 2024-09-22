package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class MammalFactory extends SpeciesFactory {
//    @Override
//    public Animals getAnimal(String type) {
//        if (Constants.Animals.Mammal.Cow.equals(type)) {
//            return new Cow();
//        } else if (Constants.Animals.Mammal.Monkey.equals(type)) {
//            return new Monkey();
//        } else if (Constants.Animals.Mammal.Tiger.equals(type)) {
//            return new Tiger();
//        }else {
//            throw new RuntimeException("Invalid animal exception!");
//        }
//    }

    // Zoo (part 1) - 3.3
    @Override
    public Animals getAnimal(String type) {
        if (Constants.Animals.Mammal.Cow.equals(type)) {
            return new Cow(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomBodyTemperature(), RandomAnimalAttributes.randomBodyHairPercentage());
        } else if (Constants.Animals.Mammal.Monkey.equals(type)) {
            return new Monkey(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomBodyTemperature(), RandomAnimalAttributes.randomBodyHairPercentage());
        } else if (Constants.Animals.Mammal.Tiger.equals(type)) {
            return new Tiger(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomBodyTemperature(), RandomAnimalAttributes.randomBodyHairPercentage());
        } else {
            throw new RuntimeException("Invalid mammal type!");
        }
    }
}
