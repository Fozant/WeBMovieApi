    package com.fauzan.movieApi.controller;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import com.fauzan.movieApi.model.Movie;
    import com.fauzan.movieApi.service.MovieService;

    @RestController
    @RequestMapping("/api/v1/movies")
    public class MovieController {

        @Autowired
        private MovieService service;

        @GetMapping("/all")
        public ResponseEntity<List<Movie>> getMovies(){

        return  new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
        }


        @GetMapping("/{id}")
        public ResponseEntity<Movie> getSingleMovie(@PathVariable )
    }
