package io.github.ricardosander.dgsexample.datafetchers;

import io.github.ricardosander.dgsexample.creators.Creator;
import io.github.ricardosander.dgsexample.dataloaders.CreatorsDataLoader;
import io.github.ricardosander.dgsexample.shows.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import org.dataloader.DataLoader;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@DgsComponent
public class CreatorDataFetcher {

    @DgsData(parentType = "Show", field = "creators")
    public CompletableFuture<List<Creator>> creators(DgsDataFetchingEnvironment dfe) {

        DataLoader<String, List<Creator>> dataLoader = dfe.getDataLoader(CreatorsDataLoader.class);
        Show show = dfe.getSource();

        return dataLoader.load(show.getId());
    }
}
