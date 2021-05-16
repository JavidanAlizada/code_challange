package main.extra.first;

public class Plant extends Creature {
    @Override
    public void breathe() {
        System.out.println("Plant can breathe");
    }

    @Override
    public void live() {
        System.out.println("Plant can live");
    }

    @Override
    public void dead() {
        System.out.println("Plant can dead");
    }
}
