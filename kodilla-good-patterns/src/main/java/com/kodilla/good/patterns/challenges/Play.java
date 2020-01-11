package com.kodilla.good.patterns.challenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Play {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> mapWithWovies = movieStore.getMovies();

        String result = mapWithWovies.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(result);

    }
}
