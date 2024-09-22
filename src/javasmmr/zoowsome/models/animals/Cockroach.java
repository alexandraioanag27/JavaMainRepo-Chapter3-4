package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect{

    boolean canFly;
    boolean isDangerous;

    public Cockroach(int numberOfLegs, String name, boolean canFly, boolean isDangerous) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public Cockroach(){
        this.nrOfLegs = 6;
        this.name = "Cockroach";
        this.canFly = false;
        this.isDangerous = false;
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
