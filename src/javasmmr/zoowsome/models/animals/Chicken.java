package javasmmr.zoowsome.models.animals;

public class Chicken extends Bird{

    boolean migrates;
    int avgFlightAltitude;

    public Chicken(int numberOfLegs, String name, boolean migrates, int avgFlightAltitude) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public Chicken(){
        this.nrOfLegs = 2;
        this.name = "Chicken";
        this.migrates = false;
        this.avgFlightAltitude = 0;
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

    public boolean isMigrates() {
        return migrates;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
