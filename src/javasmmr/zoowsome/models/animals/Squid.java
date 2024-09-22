package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.models.animals.WaterType.*;

public class Squid extends Aquatic{

    int avgSwinDepth;
    Enum waterType;

    public Squid(int numberOfLegs, String name, int avgSwinDepth, Enum waterType) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.avgSwinDepth = avgSwinDepth;
        this.waterType = waterType;
    }

    public Squid() {
        this.nrOfLegs = 10;
        this.name = "Squid";
        this.avgSwinDepth = 750;
        this.waterType = SALTWATER;
    };

    public Enum getWaterType() {
        return waterType;
    }

    public void setWaterType(Enum waterType) {
        this.waterType = waterType;
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

    public int getAvgSwinDepth() {
        return avgSwinDepth;
    }

    public void setAvgSwinDepth(int avgSwinDepth) {
        this.avgSwinDepth = avgSwinDepth;
    }
}
