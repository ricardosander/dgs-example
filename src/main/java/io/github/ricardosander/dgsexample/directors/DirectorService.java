package io.github.ricardosander.dgsexample.directors;

import java.util.List;
import java.util.stream.Collectors;

public class DirectorService {

    private static final List<Director> DIRECTORS = List.of(
            new Director("Shawn Levy", List.of("tt4574334")),
            new Director("Jason Bateman", List.of("tt0944947")),
            new Director("Stephen Daldry", List.of("tt0417299")),
            new Director("Liz Feldman", List.of("Dead to Me")),
            new Director("Andrew McCarthy", List.of("Orange is the New Black"))
    );

    public List<Director> get(List<String> shows) {
        return DIRECTORS.stream()
                .filter(director -> director.getShows().stream().anyMatch(shows::contains))
                .collect(Collectors.toUnmodifiableList());
    }
}
