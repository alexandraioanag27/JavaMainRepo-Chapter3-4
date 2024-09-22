package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals{
    int numberOfLegs;
    String name;
    boolean laysEggs;

    public Reptile(){
        super(0.1, 8);
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

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
}
