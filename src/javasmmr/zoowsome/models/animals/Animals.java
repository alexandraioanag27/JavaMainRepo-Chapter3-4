package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animals implements Killer {
    int nrOfLegs;
    String name;
    final Double maintenanceCost;
    final double dangerPerc;
    boolean takenCareOf = false;

    protected Animals(Double maintenanceCost, double dangerPerc) {
        this.maintenanceCost = ((maintenanceCost >= 0.1) && (maintenanceCost <= 8.0)) ? maintenanceCost : 0.1;
        this.dangerPerc = ((dangerPerc >= 0) && (dangerPerc <= 1)) ? dangerPerc : 0;
    }

//    public boolean kill() {
//        double randomValue = Math.random();
//        return randomValue < this.dangerPerc;
//    }

    // Chapter 4 - 4.2

    public boolean kill() {

        double randomValue = Math.random();
        double predisposition = getPredisposition();

        if(randomValue<(dangerPerc +predisposition)) {
            return true;
        } else {
        return false;
        }
    }

    public double getPredisposition(){
        return 0;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public final double getDangerPerc() {
        return dangerPerc;
    }

    public boolean isTakenCareOf() {
        return takenCareOf;
    }

    public void setTakenCareOf(boolean takenCareOf) {
        this.takenCareOf = takenCareOf;
    }
}
