package org.example.module.expressJava.complexTasks.movieRatings;

import java.util.Objects;

public class Movie {

    private String title;
    private int years;
    private String director;

    public Movie(String title, int years, String director) {
        this.title = title;
        this.years = years;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYears() {
        return years;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return years == movie.years && Objects.equals(title, movie.title) && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, years, director);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", years=" + years +
                ", director='" + director + '\'' +
                '}';
    }
}
