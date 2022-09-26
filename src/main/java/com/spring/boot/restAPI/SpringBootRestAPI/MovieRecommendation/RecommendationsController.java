package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class RecommendationsController {
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1,"Harry Potter",9.9),
                new Movie(2,"Avengers",9.7),
                new Movie(3,"Mission Impossible",9.3)
                );
    }
}
