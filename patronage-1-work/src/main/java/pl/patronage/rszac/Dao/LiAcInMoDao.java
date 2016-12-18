package pl.patronage.rszac.Dao;

import org.springframework.stereotype.Repository;
import pl.patronage.rszac.Entity.ListActorsInMovies;
import pl.patronage.rszac.Entity.Movie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by rszac on 18.12.2016.
 */
@Repository
public class LiAcInMoDao {
private static Map<ListActorsInMovies> actorsInMovie=new HashMap<>();



public ListActorsInMovies getAllActorsInMovieById(Movie movie){
    for (Movie mov : actorsInMovie){

    }

}

}
