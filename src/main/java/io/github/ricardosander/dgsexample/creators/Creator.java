package io.github.ricardosander.dgsexample.creators;

import java.util.Set;

public class Creator {
    private final String name;
    private final Set<String> shows;

    public Creator(String name, Set<String> shows) {
        this.name = name;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public Set<String> getShows() {
        return shows;
    }
}
