package javasmmr.zoowsome.models.animals;

public class Lizzard extends Reptile{

    boolean laysEggs;

    public Lizzard(int numberOfLegs, String name, boolean laysEggs) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.laysEggs = laysEggs;
    }

    public Lizzard(){
        this.nrOfLegs = 4;
        this.name = "Lizard";
        this.laysEggs = true;
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
