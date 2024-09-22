package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
    private float normalBodyTemperature;
    private float percBodyHair;

    // Constructor
    public Cow(int nrOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        this.nrOfLegs = nrOfLegs;
        this.name = name;
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    // Default constructor
    public Cow() {
        this.nrOfLegs = 4;
        this.name = "Cow";
        this.normalBodyTemperature = 37.0f;
        this.percBodyHair = 80.0f;
    }

    public float getNormalBodyTemperature() {
        return normalBodyTemperature;
    }

    public void setNormalBodyTemperature(float normalBodyTemperature) {
        this.normalBodyTemperature = normalBodyTemperature;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
