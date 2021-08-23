package io.github.ricardosander.dgsexample.shows;

import java.util.Collections;
import java.util.Set;

public class Show {

    private final String id;
    private final String title;
    private final Integer releaseYear;
    private final Integer endYear;
    private final Integer seasons;
    private final String parentalGuide;
    private final Set<ShowGenre> genres;

    public Show(String id, String title, Integer releaseYear, Integer endYear, Integer seasons, String parentalGuide,
                Set<ShowGenre> genres) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.endYear = endYear;
        this.seasons = seasons;
        this.parentalGuide = parentalGuide;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public String getParentalGuide() {
        return parentalGuide;
    }

    public Set<ShowGenre> getGenres() {
        return Collections.unmodifiableSet(genres);
    }
}