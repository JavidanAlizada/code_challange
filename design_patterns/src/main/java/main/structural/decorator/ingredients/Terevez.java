package main.structural.decorator.ingredients;

import main.structural.decorator.Doner;
import main.structural.decorator.Terkib;
import main.structural.decorator.constant.TerevezNovleri;

public class Terevez extends Terkib {

    protected TerevezNovleri terevezNovleri;

    public Terevez(Doner doner, TerevezNovleri terevezNovleri) {
        super(doner);
        this.terevezNovleri = terevezNovleri;
    }

    @Override
    public String getAd() {
        return super.doner.getAd();
    }

    @Override
    public String terkibi() {
        return super.doner.terkibi() + " " + terevezNovleri.toString() + ".";
    }

    @Override
    public float qiymet() {
        return super.doner.qiymet() + 0.3f;
    }
}
