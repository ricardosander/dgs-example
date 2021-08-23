package io.github.ricardosander.dgsexample.actors;

import java.util.Collections;
import java.util.Set;

public class Actor {

    private final String name;
    private final Set<String> shows;

    Actor(String name, Set<String> shows) {
        this.name = name;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public Set<String> getShows() {
        return Collections.unmodifiableSet(shows);
    }
}