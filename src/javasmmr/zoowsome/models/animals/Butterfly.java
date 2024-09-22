package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect{

    boolean canFly;
    boolean isDangerous;

    public Butterfly(int numberOfLegs, String name, boolean canFly, boolean isDangerous) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public Butterfly(){
        this.nrOfLegs = 8;
        this.name = "Butterfly";
        this.canFly = true;
        this.isDangerous = true;
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

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
