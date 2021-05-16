package main.structural.decorator.ingredients;

import main.structural.decorator.Doner;
import main.structural.decorator.Terkib;
import main.structural.decorator.constant.SousNovleri;

public class Sous extends Terkib {
    protected SousNovleri sousNovleri;

    public Sous(Doner doner, SousNovleri sousNovleri) {
        super(doner);
        this.sousNovleri = sousNovleri;
    }

    @Override
    public String getAd() {
        return super.doner.getAd();
    }

    @Override
    public String terkibi() {
        return super.doner.terkibi() + " " + sousNovleri.toString() + " sousu.";
    }

    @Override
    public float qiymet() {
        return sousNovleri == SousNovleri.KETCHUP ? super.doner.qiymet() + 0.3f : super.doner.qiymet() + 0.4f;
    }
}
