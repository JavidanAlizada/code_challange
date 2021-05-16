package main.structural.decorator.ingredients;

import main.structural.decorator.Doner;
import main.structural.decorator.Terkib;
import main.structural.decorator.constant.EtNovleri;

public class Et extends Terkib {

    protected EtNovleri etNovleri;

    public Et(Doner doner, EtNovleri etNovleri) {
        super(doner);
        this.etNovleri = etNovleri;
    }

    @Override
    public String getAd() {
        return super.doner.getAd();
    }

    @Override
    public String terkibi() {
        return super.doner.terkibi() + " " + etNovleri.toString() + " əti.";
    }

    @Override
    public float qiymet() {
        return etNovleri == EtNovleri.TOYUQ ? super.doner.qiymet() + 1.0f : super.doner.qiymet() + 1.2f;
    }
}
