package io.github.ricardosander.dgsexample.datafetchers;

import io.github.ricardosander.dgsexample.actors.Actor;
import io.github.ricardosander.dgsexample.actors.ActorService;
import io.github.ricardosander.dgsexample.shows.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@DgsComponent
public class ActorsDataFetcher {

    private static final Logger LOGGER = LogManager.getLogger(ActorsDataFetcher.class);

    private final ActorService actorService = new ActorService();

    @DgsData(parentType = "Show", field = "actors")
    public List<Actor> actors(DgsDataFetchingEnvironment dfe) {
        Show show = dfe.getSource();
        LOGGER.info("Searching actors to show {}", show.getTitle());
        return actorService.getByShow(show.getId());
    }
}
