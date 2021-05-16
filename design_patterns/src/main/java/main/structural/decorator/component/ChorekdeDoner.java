package main.structural.decorator.component;

import main.structural.decorator.Doner;

public class ChorekdeDoner implements Doner {
    @Override
    public String getAd() {
        return "Chorekde Doner.";
    }

    @Override
    public String terkibi() {
        return "Chorekde donere elave olundu : ";
    }

    @Override
    public float qiymet() {
        return 0;
    }
}
