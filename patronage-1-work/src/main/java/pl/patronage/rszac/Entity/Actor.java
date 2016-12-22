package pl.patronage.rszac.Entity;

import java.util.Collection;

/**
 * Created by rszac on 17.12.2016.
 */
public class Actor {
    private int id;
    private String name;
    private String surname;


    public Actor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Actor(){}

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
