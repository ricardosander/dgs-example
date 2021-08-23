package io.github.ricardosander.dgsexample.datafetchers;

import io.github.ricardosander.dgsexample.shows.Show;
import io.github.ricardosander.dgsexample.shows.ShowService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class ShowsDataFetcher {

    private static final Logger LOGGER = LogManager.getLogger(ShowsDataFetcher.class);

    private final ShowService showService = new ShowService();

    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows(
            @InputArgument Optional<String> title,
            @InputArgument(collectionType = ShowFilter.class) Optional<ShowFilter> filter
    ) {
        LOGGER.info("Searching shows by title {} and filter {}", title, filter);
        return showService.get().stream()
                .filter(show -> title.isEmpty() || show.getTitle().toUpperCase().contains(title.get().toUpperCase()))
                .filter(show -> filter.isEmpty() || filter.get().getGenre().isEmpty() || show.getGenres().contains(filter.get().getGenre().get()))
//                .filter(show -> filter.isEmpty() || filter.get().getDirector().isEmpty() || show.getDirector().contains(filter.get().getDirector().get()))
                .collect(Collectors.toList());
    }
}

