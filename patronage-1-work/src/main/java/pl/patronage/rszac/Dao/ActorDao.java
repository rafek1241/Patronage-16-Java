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

    static {
        actors = new HashMap<Integer, Actor>() {
            {
                //Wartosci domyslne w poczatkowej BD
                put(1, new Actor(1, "Jan", "Kowalski"));
                put(2, new Actor(2, "Krysia", "Kowalska"));
                put(3, new Actor(3, "Heronim", "Grębosz"));
            }
        };
    }

    public Collection<Actor> getAllActors() {
        return actors.values();
    }


    public Actor getActorById(long id) {

        return actors.get((int) id);
    }

    public void removeActorById(long id) {
        actors.remove((int) id);
    }

    public void updateActor(Actor actor) {
        Actor a = actors.get(actor.getId());
        a.setName(actor.getName());
        a.setSurname(actor.getSurname());
        actors.put(actor.getId(), a);
    }

    public void insertActor(Actor actor) {
        actors.put(actor.getId(), actor);
    }
}