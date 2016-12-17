package pl.patronage.rszac.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.patronage.rszac.Entity.Actor;
import pl.patronage.rszac.Service.ActorService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by rszac on 17.12.2016.
 */
@RestController
@RequestMapping("/actors")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Actor> getAllActors(){
        return actorService.getAllActors();

    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Actor getActorById(@PathVariable("id") long id){
        return this.actorService.getActorById(id);
    }
}
