package pl.patronage.rszac.Entity;

/**
 * Created by rszac on 18.12.2016.
 */
public class ListActorsInMovies {
    private int id;
    private Actor akt;
    private Movie mov;

    public ListActorsInMovies(int id, Actor actor, Movie mov) {
        this.id = id;
        this.akt=actor;
        this.mov=mov;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Actor getAkt() {
        return akt;
    }

    public void setAkt(Actor akt) {
        this.akt = akt;
    }

    public Movie getMov() {
        return mov;
    }

    public void setMov(Movie mov) {
        this.mov = mov;
    }
}
