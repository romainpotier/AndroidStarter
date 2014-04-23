package fr.romainpotier.androidstarterapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.romainpotier.androidstarterapi.beans.Movie;
import fr.romainpotier.androidstarterapi.service.MovieService;

@Controller
@RequestMapping(value = "/movies")
public class MoviesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MoviesController.class);

    @Autowired
    MovieService movieService;

    @RequestMapping(produces = "application/json")
    @ResponseBody
    public List<Movie> getMovies() {
        return movieService.getMovies();
    }

}
