package day04;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.setLitersFuel(5);
        car.setNumberOfKm(60);

        System.out.println(car.getAverageConsumption());

    }

}
