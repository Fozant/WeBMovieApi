package com.fauzan.movieApi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fauzan.movieApi.model.Movie;
import com.fauzan.movieApi.repo.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repo;

    public List<Movie> findAllMovies() {
        return repo.findAll();
    }

   

    // public Optional<Movie> findMovieByImdbId(String imdbId) {
        // return repo.findMovieByImdbId(imdbId);
    // }
}
