package day04;

public class Car {
    private int litersFuel;
    private int numberOfKm;

    public double getAverageConsumption () {

        return ((litersFuel*1.0)/numberOfKm)*100;
    }

    public void setLitersFuel(int litersFuel) {
        this.litersFuel = litersFuel;
    }

    public void setNumberOfKm(int numberOfKm) {
        this.numberOfKm = numberOfKm;
    }


}
