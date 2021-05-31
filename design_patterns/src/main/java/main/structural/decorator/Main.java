package main.structural.decorator;

import main.structural.decorator.component.LavashdaDoner;
import main.structural.decorator.constant.EtNovleri;
import main.structural.decorator.constant.SousNovleri;
import main.structural.decorator.constant.TerevezNovleri;
import main.structural.decorator.ingredients.Et;
import main.structural.decorator.ingredients.FriKartof;
import main.structural.decorator.ingredients.Sous;
import main.structural.decorator.ingredients.Terevez;

public class Main {

    public static void main(String[] args) {

        Doner doner =
                new Et(
                        new Sous(
                                new Sous(
                                        new Terevez(
                                                new Et(new FriKartof(
                                                        new LavashdaDoner()),
                                                        EtNovleri.MAL),
                                                TerevezNovleri.XIYAR),
                                        SousNovleri.KETCHUP),
                                SousNovleri.MAYONEZ),
                        EtNovleri.TOYUQ);
        System.out.println("terkibi: " + doner.terkibi() + "\nqiymeti: " + doner.qiymet());
    }
}
