package domain;

public class Movie {
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;

    public void display() {
        System.out.println(actor.name + "  " + actor.gender + " " + actor.age);
    }
}
