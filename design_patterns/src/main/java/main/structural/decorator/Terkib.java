package main.structural.decorator;

public abstract class Terkib implements Doner {

    protected Doner doner;

    public Terkib(Doner doner) {
        this.doner = doner;
    }


}
