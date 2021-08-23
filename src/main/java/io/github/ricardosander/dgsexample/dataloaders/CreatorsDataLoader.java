package io.github.ricardosander.dgsexample.dataloaders;

import io.github.ricardosander.dgsexample.creators.Creator;
import io.github.ricardosander.dgsexample.creators.CreatorService;
import com.netflix.graphql.dgs.DgsDataLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dataloader.MappedBatchLoader;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@DgsDataLoader(name = "creators")
public class CreatorsDataLoader implements MappedBatchLoader<String, List<Creator>> {

    private static final Logger LOGGER = LogManager.getLogger(CreatorsDataLoader.class);

    private final CreatorService creatorService = new CreatorService();

    @Override
    public CompletionStage<Map<String, List<Creator>>> load(Set<String> shows) {
        LOGGER.info("Loads creators by shows {}", shows);
        return CompletableFuture.supplyAsync(() -> creatorService.retrieveByShows(shows));
    }
}
