package com.fauzan.movieApi.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fauzan.movieApi.model.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    Movie findAllMovies(String imdb_id);
}

