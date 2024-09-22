package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals{
    int numberOfLegs;
    String name;
    int avgSwinDepth;
    Enum waterType;

    public Aquatic(){
        super(0.1, 2);
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
