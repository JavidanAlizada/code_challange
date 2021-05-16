package main.structural.decorator.ingredients;

import main.structural.decorator.Doner;
import main.structural.decorator.Terkib;

public class FriKartof extends Terkib {

    public FriKartof(Doner doner) {
        super(doner);
    }

    @Override
    public String getAd() {
        return super.doner.getAd();
    }

    @Override
    public String terkibi() {
        return super.doner.terkibi() + " Fri-kartof.";
    }

    @Override
    public float qiymet() {
        return super.doner.qiymet() + 0.5f;
    }
}
