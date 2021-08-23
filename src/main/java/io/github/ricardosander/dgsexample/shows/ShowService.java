package io.github.ricardosander.dgsexample.shows;

import java.util.List;
import java.util.Set;

public class ShowService {

    private static final List<Show> SHOWS = List.of(
            new Show(
                    "tt4574334",
                    "Stranger Things",
                    2016,
                    null,
                    3,
                    "TV-14",
                    Set.of(ShowGenre.drama, ShowGenre.fantasy, ShowGenre.horror)
            ),
            new Show(
                    "tt0944947",
                    "Game of Thrones",
                    2011,
                    2019,
                    8,
                    "TV-MA",
                    Set.of(ShowGenre.action, ShowGenre.adventure, ShowGenre.drama)
            ),
            new Show(
                    "tt0417299",
                    "Avatar: The Last Airbender",
                    2005,
                    2008,
                    3,
                    "TV-Y7-FV",
                    Set.of(ShowGenre.action, ShowGenre.adventure, ShowGenre.animation)
            )
    );

    public List<Show> get() {
        return SHOWS;
    }
}
