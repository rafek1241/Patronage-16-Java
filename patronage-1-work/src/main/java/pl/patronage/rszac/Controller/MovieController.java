package pl.patronage.rszac.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.patronage.rszac.Entity.Movie;
import pl.patronage.rszac.Service.MovieService;

import java.util.Collection;

/**
 * Created by rszac on 17.12.2016.
 */
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Movie> getAllMovies(){
        return movieService.getAllMovies();

    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable("id") long id){
        return this.movieService.getMovieById(id);
    }
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void removeMovieById(@PathVariable("id") long id){
        movieService.removeMovieById(id);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void updateMovie(@RequestBody Movie movie){
        movieService.updateMovie(movie);
    }
    @RequestMapping(method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void insertMovie(@RequestBody Movie movie){
        movieService.insertMovie(movie);
    }

}
