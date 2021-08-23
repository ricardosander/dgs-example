package io.github.ricardosander.dgsexample.directors;

import java.util.List;

public class Director {
    private final String name;
    private List<String> shows;

    public Director(String name, List<String> shows) {
        this.name = name;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public List<String> getShows() {
        return shows;
    }
}
