package day05;

public class Movie {
    private String title;
    private int yearOfProduction;
    private int rate;
    private int numberOfRate;
    private int sumOfRate;
    private double avgRate;

    public Movie (String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction=yearOfProduction;
    }

    public double doRate (int rate) {
        sumOfRate += rate;
        numberOfRate++;
        avgRate= (sumOfRate*1.0 / numberOfRate);
        return avgRate;
    }
}
