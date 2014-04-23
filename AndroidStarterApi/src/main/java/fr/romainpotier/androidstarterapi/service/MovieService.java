package fr.romainpotier.androidstarterapi.service;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.romainpotier.androidstarterapi.beans.Movie;

@Service
public class MovieService {

    public List<Movie> getMovies() {

        Movie movie = new Movie();
        movie.setTitle("Star Wars: Episode V - The Empire Strikes Back");
        movie.setYear(1980);
        movie.setNationality("American");

        Movie movie2 = new Movie();
        movie.setTitle("Fast & Furious 6");
        movie.setYear(2013);
        movie.setNationality("American");

        Movie movie3 = new Movie();
        movie.setTitle("Léon");
        movie.setYear(1994);
        movie.setNationality("French");

        List<Movie> movies = newArrayList(movie, movie2, movie3);

        return movies;
    }

}
