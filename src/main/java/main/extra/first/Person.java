package main.extra.first;

public class Person extends Creature implements CanTalk, Movable {
    @Override
    public void breathe() {
        System.out.println("Person can breathe");
    }

    @Override
    public void live() {
        System.out.println("Person can live");
    }

    @Override
    public void dead() {
        System.out.println("Person can dead");
    }

    @Override
    public void talk() {
        System.out.println("Person can talk");
    }

    @Override
    public void move() {
        System.out.println("Person can move");
    }
}
