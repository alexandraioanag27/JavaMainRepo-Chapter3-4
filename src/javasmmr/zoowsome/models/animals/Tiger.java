package javasmmr.zoowsome.models.animals;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tiger extends Mammal{

    float normalBodyTemperature;
    float percBodyHair;

    public Tiger(int numberOfLegs, String name, float normalBodyTemperature, float percBodyHair) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.normalBodyTemperature = normalBodyTemperature;
        this.percBodyHair = percBodyHair;
    }

    public Tiger(){
        this.nrOfLegs = 4;
        this.name = "Tiger";
        this.normalBodyTemperature = 37.8F;
        this.percBodyHair = 90F;
    };

    @Override
    public double getPredisposition() {
        LocalDate now = LocalDate.now();

        LocalDate start = LocalDate.of(2024, 6, 24);
        LocalDate end = LocalDate.of(2024, 12, 31);

        if (now.isAfter(start) || now.isBefore(end)) {
            return 0.50;
        } else {
            return 0;
        }
    }

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
