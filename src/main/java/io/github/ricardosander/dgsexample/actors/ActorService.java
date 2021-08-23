package io.github.ricardosander.dgsexample.actors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ActorService {

    private static final List<Actor> ACTORS = List.of(
            new Actor("Winona Ryder", Set.of("tt4574334")),
            new Actor("David Harbour", Set.of("tt4574334")),
            new Actor("Finn Wolfhard", Set.of("tt4574334")),
            new Actor("Millie Bobby Brown", Set.of("tt4574334")),
            new Actor("Gaten Matarazzo", Set.of("tt4574334")),
            new Actor("Caleb McLaughlin", Set.of("tt4574334")),
            new Actor("Charlie Heaton", Set.of("tt4574334")),
            new Actor("Joe Keery", Set.of("tt4574334")),
            new Actor("Noah Schnapp", Set.of("tt4574334")),
            new Actor("Sadie Sink", Set.of("tt4574334")),
            new Actor("Peter Dinklage", Set.of("tt0944947")),
            new Actor("Lena Headey", Set.of("tt0944947")),
            new Actor("Emilia Clarke", Set.of("tt0944947")),
            new Actor("Kit Harington", Set.of("tt0944947")),
            new Actor("Sophie Turner", Set.of("tt0944947")),
            new Actor("Maisie Williams", Set.of("tt0944947")),
            new Actor("Nikolaj Coster-Waldau", Set.of("tt0944947")),
            new Actor("Iain Glen", Set.of("tt0944947")),
            new Actor("Alfie Allen", Set.of("tt0944947")),
            new Actor("Conleth Hill", Set.of("tt0944947")),
            new Actor("Dee Bradley Baker", Set.of("tt0417299")),
            new Actor("Zach Tyler", Set.of("tt0417299")),
            new Actor("Mae Whitman", Set.of("tt0417299")),
            new Actor("Jack De Sena", Set.of("tt0417299")),
            new Actor("Dante Basco", Set.of("tt0417299")),
            new Actor("Michaela Jill Murphy", Set.of("tt0417299")),
            new Actor("Mako", Set.of("tt0417299")),
            new Actor("Grey Griffin", Set.of("tt0417299")),
            new Actor("André Sogliuzzo", Set.of("tt0417299")),
            new Actor("Cricket Leigh", Set.of("tt0417299"))
    );

    public List<Actor> getByShow(String show) {
        return ACTORS.stream()
                .filter(actor -> actor.getShows().contains(show))
                .collect(Collectors.toUnmodifiableList());
    }
}
