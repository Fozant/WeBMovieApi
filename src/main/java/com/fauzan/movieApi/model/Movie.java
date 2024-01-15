package com.fauzan.movieApi.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    private String id;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "title")
    private String title;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "trailer_link")
    private String trailerLink;

    @Column(name = "poster")
    private String poster;

    @Column(name = "genres")
    private List<String> genres;

    @Column(name = "backdrops")
    private List<String> backdrops;

    // Default constructor for JPA
    public Movie() {
    }

    // Full constructor
    public Movie(String id, String imdbId, String title, String releaseDate, String trailerLink,
                 String poster, List<String> genres, List<String> backdrops) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
    }

}
