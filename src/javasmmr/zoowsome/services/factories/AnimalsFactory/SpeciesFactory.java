package javasmmr.zoowsome.services.factories.AnimalsFactory;

import javasmmr.zoowsome.models.animals.Animals;

public abstract class SpeciesFactory {

    public abstract Animals getAnimal(String type);

}
