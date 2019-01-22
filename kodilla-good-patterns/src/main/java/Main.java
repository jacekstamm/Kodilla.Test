import com.kodilla.good.patterns.challenges.MovieStore;


public class Main {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .map(n -> n.getValue().toString() + " ! ")
                .forEach(System.out::print);
    }
}
