package pl.patronage.rszac.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patronage.rszac.Dao.ActorDao;
import pl.patronage.rszac.Entity.Actor;

import java.util.Collection;

/**
 * Created by rszac on 17.12.2016.
 */
@Service
public class ActorService {
    @Autowired
    private ActorDao actorDao;

    public Collection<Actor> getAllActors() {
        return this.actorDao.getAllActors();

    }

    public Actor getActorById(long id) {
//Tu mozna robic badania czy istnieje taki aktor itp itp.
        return this.actorDao.getActorById(id);
    }

    public void removeActorById(long id) {
        actorDao.removeActorById(id);
    }

    public void updateActor(Actor actor) {
        this.actorDao.updateActor(actor);
    }

    public void insertActor(Actor actor) {
        this.actorDao.insertActor(actor);
    }
}
