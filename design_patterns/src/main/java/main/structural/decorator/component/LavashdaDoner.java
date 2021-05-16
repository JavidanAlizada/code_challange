package main.structural.decorator.component;

import main.structural.decorator.Doner;

public class LavashdaDoner implements Doner {
    @Override
    public String getAd() {
        return "Lavashda doner.";
    }

    @Override
    public String terkibi() {
        return "lavashda donere elave olundu : ";
    }

    @Override
    public float qiymet() {
        return 0;
    }
}
