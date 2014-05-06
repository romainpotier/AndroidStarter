package fr.romainpotier.androidstarter.service;

import java.util.List;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

import fr.romainpotier.androidstarter.beans.Movie;

/**
 * REST webservice example
 * 
 * @author Romain Potier
 */
@Rest(rootUrl = "http://176.31.101.144:99", converters = { MappingJacksonHttpMessageConverter.class })
public interface MoviesService {

    @Get("/movies")
    List<Movie> getMovies();
}
