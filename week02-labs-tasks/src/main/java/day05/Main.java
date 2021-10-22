package day05;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Outbreak", 1991);

        movie.doRate(5);

        Viewer viewer = new Viewer();
        viewer.watchMovie(movie, 2);
        viewer.watchMovie(movie, 5);

        System.out.println(movie.doRate(3));

    }
}
