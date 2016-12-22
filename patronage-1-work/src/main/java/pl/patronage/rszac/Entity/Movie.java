package pl.patronage.rszac.Entity;

import jdk.nashorn.internal.ir.annotations.Reference;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by rszac on 17.12.2016.
 */

public class Movie {
    private int id;
    private String name;
    private List<Actor> actors;

    public Movie(int id, String name, List<Actor> list) {
        this.id = id;
        this.name = name;
        this.actors = list;
    }

    public Movie(){}
    public Movie(int id, String name){
        this.id=id;
        this.name=name;
        this.actors= new ArrayList<Actor>();
    }

    public void setActors(List<Actor> list){
    this.actors = list;
    }


    public List<Actor> getActors() {
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
