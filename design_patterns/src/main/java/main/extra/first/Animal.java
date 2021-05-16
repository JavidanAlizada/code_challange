package main.extra.first;

public class Animal extends Creature implements Movable {
    @Override
    public void breathe() {
        System.out.println("Animal can breathe");
    }

    @Override
    public void live() {
        System.out.println("Animal can live");
    }

    @Override
    public void dead() {
        System.out.println("Animal can dead");
    }

    @Override
    public void move() {
        System.out.println("Animal can move");
    }
}
