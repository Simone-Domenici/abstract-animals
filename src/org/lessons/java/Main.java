package org.lessons.java;

import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {

    public static void faiVolare(IVolante animale){
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Aquila aquila = new Aquila();
        System.out.println(" --- Aquila --- ");
        aquila.dormi();
        aquila.mangia();
        aquila.verso();
        System.out.println();

        System.out.println(" --- Cane --- ");
        Cane cane = new Cane();
        cane.dormi(); 
        cane.mangia();
        cane.verso();
        System.out.println();

        System.out.println(" --- Delfino --- ");
        Delfino delfino = new Delfino();
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
        System.out.println();

        System.out.println(" --- Passerotto --- ");
        Passerotto passerotto = new Passerotto();
        passerotto.dormi();
        passerotto.mangia();
        passerotto.verso();
        System.out.println();

        System.out.println("Metodi interfaccia");
        faiVolare(passerotto);
        faiVolare(aquila);
        faiNuotare(delfino);
    }

}
