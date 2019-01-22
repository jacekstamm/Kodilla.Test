import com.kodilla.good.patterns.challenges.MovieStore;


public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .map(n -> n + " ! ")
                .forEach(System.out::print);
    }
}
