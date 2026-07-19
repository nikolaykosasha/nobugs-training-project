package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.accountingStudentGrades.InvalidGradeException;
import org.example.module.expressJava.complexTasks.movieRatings.Movie;
import org.example.module.expressJava.complexTasks.movieRatings.MovieService;
import org.example.module.expressJava.complexTasks.movieRatings.Rating;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieRatingsTest {

    @Test
    @DisplayName("Проверка добавление рейтинга к фильму")
    void addRatingTest() {
        Movie movie = new Movie("Pulp Fiction", 1994, "Quentin Tarantino");
        Rating rating1 = new Rating<>(8.0);
        Rating rating2 = new Rating<>(7.0);
        MovieService movieService = new MovieService();

        movieService.addRating(movie, rating1);
        int instanceSize = movieService.getMovieStorage().get(movie).size();
        movieService.addRating(movie, rating2);

        int actualResult = movieService.getMovieStorage().get(movie).size();

        assertEquals(instanceSize + 1, actualResult);
    }

    @Test
    @DisplayName("Проверка расчета средней оценки")
    void averageRaitingTest() {
        Movie movie = new Movie("Pulp Fiction", 1994, "Quentin Tarantino");
        Rating rating1 = new Rating<>(8.0);
        Rating rating2 = new Rating<>(7.0);
        MovieService movieService = new MovieService();

        double exResult = (rating1.getRating().doubleValue() + rating2.getRating().doubleValue()) / 2.0;

        movieService.addRating(movie, rating1);
        movieService.addRating(movie, rating2);
        double actualResult = movieService.averageRaiting(movie);

        assertEquals(exResult, actualResult);
    }

    @Test
    @DisplayName("Проверка сортировки")
    void sortedTest() {
        Movie movie = new Movie("Pulp Fiction", 1994, "Quentin Tarantino");
        Rating ratingP1 = new Rating<>(8.0);
        Rating ratingP2 = new Rating<>(7.0);
        Rating ratingP3 = new Rating<>(9.0);
        MovieService movieService = new MovieService();

        movieService.addRating(movie, ratingP1);
        movieService.addRating(movie, ratingP2);
        movieService.addRating(movie, ratingP3);

        Movie movie2 = new Movie("The Godfather", 1972, "Francis Ford Coppola");
        Rating ratingG1 = new Rating<>(9.0);
        Rating ratingG2 = new Rating<>(9.0);
        Rating ratingG3 = new Rating<>(9.0);

        movieService.addRating(movie2, ratingG1);
        movieService.addRating(movie2, ratingG2);
        movieService.addRating(movie2, ratingG3);

        Movie actualResult = movieService.getMovieSorted().getFirst();

        assertEquals(movie2.getTitle(), actualResult.getTitle());
    }

    @Test
    @DisplayName("Проверка валидации оценки фильма")
    void validRatingTest() {
        Movie movie = new Movie("Pulp Fiction", 1994, "Quentin Tarantino");
        Rating ratingP1 = new Rating<>(0.0);
        MovieService movieService = new MovieService();

        assertThrows(IllegalArgumentException.class, () -> {
            movieService.addRating(movie, ratingP1);
        });
    }
}
