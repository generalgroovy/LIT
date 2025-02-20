package de.tuberlin.tkn.lit.model.actors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import de.tuberlin.tkn.lit.model.Actor;

public class Person extends Actor {

    @JsonIgnore
    private static final String TYPE_NAME = "Person";

    public Person() {
    }

    public Person(String name) {
        super(name);
    }

    public Person(Actor actor) {
        super(actor);
    }
}
