package day04;

public class GasStation {
    private double price;



    public GasStation (double price) {
        this.price = price;
    }

    public double refueling (Car car, int litersFuel) {
        car.setLitersFuel(litersFuel);
        return litersFuel*price;
    }
}
