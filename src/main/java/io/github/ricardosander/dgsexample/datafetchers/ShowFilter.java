package io.github.ricardosander.dgsexample.datafetchers;

import io.github.ricardosander.dgsexample.shows.ShowGenre;

import java.util.Optional;

public class ShowFilter {

    private String director;
    private ShowGenre genre;

    public ShowFilter() {
    }

    public ShowFilter(String director, ShowGenre genre) {
        this.director = director;
        this.genre = genre;
    }

    public Optional<String> getDirector() {
        return Optional.ofNullable(director);
    }

    public Optional<ShowGenre> getGenre() {
        return Optional.ofNullable(genre);
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(ShowGenre genre) {
        this.genre = genre;
    }
}
