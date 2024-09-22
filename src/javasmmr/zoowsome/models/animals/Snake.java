package javasmmr.zoowsome.models.animals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Snake extends Reptile{

    boolean laysEggs;

    public Snake(int numberOfLegs, String name, boolean laysEggs) {
        this.nrOfLegs = numberOfLegs;
        this.name = name;
        this.laysEggs = laysEggs;
    }

    public Snake(){
        this.nrOfLegs = 0;
        this.name = "Snake";
        this.laysEggs = true;
    };

    @Override
    public double getPredisposition() {
        LocalDate now = LocalDate.now();
        DayOfWeek currentDay = now.getDayOfWeek();

        LocalDate start = LocalDate.of(2024, 6, 24);
        LocalDate end = LocalDate.of(2024, 12, 31);

        if (currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY) {
            return 0.10;
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
