package pl.patronage.rszac.Dao;

import org.springframework.stereotype.Repository;
import pl.patronage.rszac.Entity.Actor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rszac on 17.12.2016.
 */
@Repository
public class ActorDao {
    private static Map<Integer, Actor> actors;
    static{
        actors = new HashMap<Integer, Actor>(){
            {
                put(1, new Actor(1,"Jan", "Kowalski"));
                put(2, new Actor(2,"Krysia", "Kowalska"));
                put(3, new Actor(3,"Heronim", "Grębosz"));
            }
        };
    }

    public Collection<Actor> getAllActors(){
    return this.actors.values();
    }


public Actor getActorById(long id){

    return this.actors.get((int)id);
}
}