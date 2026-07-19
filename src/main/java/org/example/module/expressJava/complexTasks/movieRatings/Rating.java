package org.example.module.expressJava.complexTasks.movieRatings;

public class Rating<T extends Number> {
    private T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }
}
