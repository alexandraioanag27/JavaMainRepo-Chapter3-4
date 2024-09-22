package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class InsectFactory extends SpeciesFactory {

//    @Override
//    public Animals getAnimal(String type) {
//        if (Constants.Animals.Insect.Cockroach.equals(type)) {
//            return new Cockroach();
//        } else if (Constants.Animals.Insect.Butterfly.equals(type)) {
//            return new Butterfly();
//        } else if (Constants.Animals.Insect.Spider.equals(type)) {
//            return new Spider();
//        }else {
//            throw new RuntimeException("Invalid animal exception!");
//        }
//    }

    // Zoo (part 1) - 3.3
    @Override
    public Animals getAnimal(String type) {
        if (Constants.Animals.Insect.Cockroach.equals(type)) {
            return new Cockroach(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomCanFly(), RandomAnimalAttributes.randomIsDangerous());
        } else if (Constants.Animals.Insect.Butterfly.equals(type)) {
            return new Butterfly(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomCanFly(), RandomAnimalAttributes.randomIsDangerous());
        } else if (Constants.Animals.Insect.Spider.equals(type)) {
            return new Spider(RandomAnimalAttributes.randomNumberOfLegs(), RandomAnimalAttributes.randomName(), RandomAnimalAttributes.randomCanFly(), RandomAnimalAttributes.randomIsDangerous());
        } else {
            throw new RuntimeException("Invalid insect type!");
        }
    }
}
