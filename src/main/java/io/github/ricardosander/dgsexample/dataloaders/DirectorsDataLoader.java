package io.github.ricardosander.dgsexample.dataloaders;

import io.github.ricardosander.dgsexample.directors.Director;
import io.github.ricardosander.dgsexample.directors.DirectorService;
import com.netflix.graphql.dgs.DgsDataLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dataloader.BatchLoader;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@DgsDataLoader(name = "directors")
public class DirectorsDataLoader implements BatchLoader<String, Director> {

    private static final Logger LOGGER = LogManager.getLogger(DirectorsDataLoader.class);

    private final DirectorService directorService = new DirectorService();

    @Override
    public CompletionStage<List<Director>> load(List<String> shows) {
        LOGGER.info("Loads directors by shows {}", shows);
        return CompletableFuture.supplyAsync(() -> directorService.get(shows));
    }
}
