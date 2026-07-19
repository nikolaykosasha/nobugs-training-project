package org.example.module.expressJava.complexTasks.movieRatings;

import java.util.*;

public class MovieService {
    private Map<Movie, List<Rating>> movieStorage = new HashMap<>();

    public Map<Movie, List<Rating>> getMovieStorage() {
        return movieStorage;
    }

    public synchronized void addRating(Movie movieTitle, Rating rating) {
        checkedRating(rating);

        movieStorage.computeIfAbsent(movieTitle, m -> new ArrayList<>());
        movieStorage.get(movieTitle).add(rating);
    }

    public double averageRaiting(Movie movie) {
        List<Rating> movieRating = movieStorage.get(movie);
        if (movieRating == null || movieRating.isEmpty()) {
            return 0.0;
        }

       return movieRating.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getMovieSorted() {
        return movieStorage.keySet().stream()
                .sorted(Comparator.comparingDouble(this::averageRaiting).reversed())
                .toList();
    }

    private void checkedRating(Rating rating) {
        double value = rating.getRating().doubleValue();

        if (value < 1.0 || value > 10.0) {
            throw new IllegalArgumentException("Рейтинг должен быть в пределах 1-10");
        }
    }
}
