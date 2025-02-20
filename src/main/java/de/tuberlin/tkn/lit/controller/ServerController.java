package de.tuberlin.tkn.lit.controller;

import de.tuberlin.tkn.lit.storage.IStorage;
import de.tuberlin.tkn.lit.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@RestController
public class ServerController {

    // Dependency Injection
	
	@Autowired
	IStorage storage;
	
	// Dependency Injection END

    @Autowired
    public ServerController() {

        //STUB START

    	// actors are initalized in constructor of ClientController

        //STUB END
    }

    /**
    *  Http route for others servers to use, to post activities to an inbox, belonging to
    *  an actor, held by this server. Also all side effects of the activity are processed.
    * @param  actorname name of the actor whose inbox is the target
    * @param  activity  activity to post and process
    */
    @RequestMapping(value = "/{actorname}/inbox", method = RequestMethod.POST)
    public void postInbox(@PathVariable("actorname") String actorname, @RequestBody Activity activity) {
        //STUB START

    	this.storage.AddInbox(actorname, new LinkOrObject(activity));
        
        OrderedCollection inbox = this.storage.GetInbox(actorname);
        System.out.println(inbox.getOrderedItems());

        //STUB END
    }

    /**
    *  Http route for others servers to use, to retrieve the outbox of a specific actor,
    *  held by this server.
    * @param  actorname name of the actor whose outbox is the target
    * @return the outbox belonging to the actor
    */
    @RequestMapping(value = "/{actorname}/outbox", method = RequestMethod.GET)
    public OrderedCollection getOutbox(@PathVariable("actorname") String actorname) {
        return null;
    }
}
