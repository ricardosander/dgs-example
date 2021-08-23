package io.github.ricardosander.dgsexample.datafetchers;

import io.github.ricardosander.dgsexample.directors.Director;
import io.github.ricardosander.dgsexample.shows.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;

import java.util.concurrent.CompletableFuture;

@DgsComponent
public class DirectorsDataFetcher {

    @DgsData(parentType = "Show", field = "director")
    public CompletableFuture<Director> director(DataFetchingEnvironment dfe) {

        DataLoader<String, Director> dataLoader = dfe.getDataLoader("directors");
        Show show = dfe.getSource();

        return dataLoader.load(show.getId());
    }
}
