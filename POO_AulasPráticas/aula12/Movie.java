package aula12;

import java.util.Objects;

public class Movie {
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int time;

    public Movie(String name, double score, String rating, String genre, int time) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Movie name(String name) {
        setName(name);
        return this;
    }

    public Movie score(double score) {
        setScore(score);
        return this;
    }

    public Movie rating(String rating) {
        setRating(rating);
        return this;
    }

    public Movie genre(String genre) {
        setGenre(genre);
        return this;
    }

    public Movie time(int time) {
        setTime(time);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && score == movie.score && Objects.equals(rating, movie.rating)
                && Objects.equals(genre, movie.genre) && Objects.equals(time, movie.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, rating, genre, time);
    }

    @Override
    public String toString() {
        return "{" +
                " name = '" + getName() + "'" +
                ", score = '" + getScore() + "'" +
                ", rating = '" + getRating() + "'" +
                ", genre = '" + getGenre() + "'" +
                ", time = '" + getTime() + "'" +
                "}";
    }

}
