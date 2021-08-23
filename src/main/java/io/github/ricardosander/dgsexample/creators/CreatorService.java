package io.github.ricardosander.dgsexample.creators;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class CreatorService {

    private static final List<Creator> CREATORS = List.of(
        new Creator("Matt Duffer", Set.of("tt4574334")),
        new Creator("Ross Duffer", Set.of("tt4574334")),
        new Creator("David Benioff", Set.of("tt0944947")),
        new Creator("D.B. Weiss", Set.of("tt0944947")),
        new Creator("Michael Dante DiMartino", Set.of("tt0417299")),
        new Creator("Bryan Konietzko", Set.of("tt0417299"))
    );

    public Map<String, List<Creator>> retrieveByShows(Set<String> shows) {
        return shows.stream()
                .collect(toMap(
                        show -> show,
                        show -> CREATORS.stream()
                                .filter(creator -> creator.getShows().contains(show))
                                .collect(Collectors.toList())
                ));
    }
}
