package pl.patronage.rszac.Dao;

import org.springframework.stereotype.Repository;
import pl.patronage.rszac.Entity.Movie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rszac on 17.12.2016.
 */
@Repository
public class MovieDao {
    private static Map<Integer, Movie> movies;
    static{
    movies = new HashMap<Integer, Movie>() {
        {
       //Wartosci domyslne w poczatkowej BD
            put(1, new Movie(1, "jan", "kowalski"));
        }
    };
    }
    public Movie getMovieById(long id) {
        return movies.get((int) id);
    }

    public Collection<Movie> getAllMovies() {
        return movies.values();
    }

    public void removeMovieById(long id) {
        movies.remove((int) id);
    }

    public void updateMovie(Movie movie) {
    Movie m = movies.get(movie.getId());
    m.setName(movie.getName());
    }

    public void insertMovie(Movie movie) {
        this.movies.put(movie.getId(),movie);
    }
}
