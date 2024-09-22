package javasmmr.zoowsome.models.animals;

import java.time.LocalDate;
import java.time.Month;

public class Crocodile extends Reptile{

    boolean laysEggs;

    public Crocodile(int numberOfLegs, String name, boolean laysEggs) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.laysEggs = laysEggs;
    }

    public Crocodile(){
        this.nrOfLegs = 4;
        this.name = "Crocodile";
        this.laysEggs = true;
    };

    @Override
    public double getPredisposition() {
        LocalDate now = LocalDate.now();
        Month currentMonth = now.getMonth();

        if (currentMonth == Month.JULY) {
            return 0.30;
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

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
}
