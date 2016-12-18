package pl.patronage.rszac.Entity;

import jdk.nashorn.internal.ir.annotations.Reference;

import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by rszac on 17.12.2016.
 */

public class Movie {
    private int id;
    private String name;
    @OneToMany(mappedBy = "actors")
    private Collection<Actor> actors;

    public Movie(int id, String name, Collection<Actor> list) {
        this.id = id;
        this.name = name;
        this.actors = list;
    }

    public Movie(){}

    public void setActors(Collection<Actor> list){
    this.actors = list;
    }


    public Collection<Actor> getActors() {
        return actors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
