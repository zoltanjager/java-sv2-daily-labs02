package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(357);


        System.out.println("Tankolás ára: " +gasStation.refueling(car, 32));

        car.setNumberOfKm(456);
        System.out.println("A fogyasztás:" + car.getAverageConsumption());
    }
}
