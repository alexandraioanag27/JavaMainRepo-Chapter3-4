package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal{

    float normalBodyTemperature;
    float percBodyHair;

    public Monkey(int numberOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    public Monkey(){
        this.nrOfLegs = 4;
        this.name = "Monkey";
        this.normalBodyTemperature = 36F;
        this.percBodyHair = 80F;
    };

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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
