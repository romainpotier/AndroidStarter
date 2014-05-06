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
        movie2.setTitle("Fast & Furious 6");
        movie2.setYear(2013);
        movie2.setNationality("American");

        Movie movie3 = new Movie();
        movie3.setTitle("Léon");
        movie3.setYear(1994);
        movie3.setNationality("French");

        List<Movie> movies = newArrayList(movie, movie2, movie3);

        return movies;
    }

}
