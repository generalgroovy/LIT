package de.tuberlin.tkn.lit.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import de.tuberlin.tkn.lit.deserializer.LinkOrObjectDeserializer;


// TODO: Resolve getObject() with LitObject (renaming?)
public abstract class Activity extends LitObject {

    //@JsonDeserialize(using = ActorDeserializer2.class)
    private LinkOrObject actor;
    private LinkOrObject object;
    private LinkOrObject target;
    private LinkOrObject result;
    private LinkOrObject origin;
    private LinkOrObject instrument;

    public Activity() {
    }

    public Activity(LinkOrObject actor, LinkOrObject object, LinkOrObject target, LinkOrObject result, LinkOrObject origin, LinkOrObject instrument) {
        this.actor = actor;
        this.object = object;
        this.target = target;
        this.result = result;
        this.origin = origin;
        this.instrument = instrument;
    }

    public Activity(Activity activity) {
        this.actor = activity.actor;
        this.object = activity.object;
        this.target = activity.target;
        this.result = activity.result;
        this.origin = activity.origin;
        this.instrument = activity.instrument;
    }

    public LinkOrObject getActor() {
        return actor;
    }

    public void setActor(LinkOrObject actor) {
        this.actor = actor;
    }

    @JsonSetter("actor")
    public void setActor(JsonNode s) throws JsonProcessingException {
        actor = LinkOrObjectDeserializer.deserialize(s);
    }

    public LinkOrObject getObject() {
        return object;
    }

    public void setObject(LinkOrObject object) {
        this.object = object;
    }

    @JsonSetter("object")
    public void setObject(JsonNode s) throws JsonProcessingException {
        object = LinkOrObjectDeserializer.deserialize(s);
    }

    public LinkOrObject getTarget() {
        return target;
    }

    public void setTarget(LinkOrObject target) {
        this.target = target;
    }

    @JsonSetter("target")
    public void setTarget(JsonNode s) throws JsonProcessingException {
        target = LinkOrObjectDeserializer.deserialize(s);
    }

    public LinkOrObject getResult() {
        return result;
    }

    public void setResult(LinkOrObject result) {
        this.result = result;
    }

    @JsonSetter("result")
    public void setResult(JsonNode s) throws JsonProcessingException {
        result = LinkOrObjectDeserializer.deserialize(s);
    }

    public LinkOrObject getOrigin() {
        return origin;
    }

    public void setOrigin(LinkOrObject origin) {
        this.origin = origin;
    }

    @JsonSetter("origin")
    public void setOrigin(JsonNode s) throws JsonProcessingException {
        origin = LinkOrObjectDeserializer.deserialize(s);
    }

    public LinkOrObject getInstrument() {
        return instrument;
    }

    public void setInstrument(LinkOrObject instrument) {
        this.instrument = instrument;
    }

    @JsonSetter("instrument")
    public void setInstrument(JsonNode s) throws JsonProcessingException {
        instrument = LinkOrObjectDeserializer.deserialize(s);
    }
}
