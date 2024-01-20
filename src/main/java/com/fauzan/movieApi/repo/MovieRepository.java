package com.fauzan.movieApi.repo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fauzan.movieApi.model.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional <Movie> findMovieByImdbId(String imdbId);
}

