package main.extra.first;

public abstract class Creature {
    public int height;
    public int weight;

    public abstract void breathe();

    public abstract void live();

    public abstract void dead();

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
