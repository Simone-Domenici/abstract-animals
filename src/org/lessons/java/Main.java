package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Animale aquila = new Aquila();
        System.out.println(" --- Aquila --- ");
        aquila.dormi();
        aquila.mangia();
        aquila.verso();
        System.out.println();

        System.out.println(" --- Cane --- ");
        Animale cane = new Cane();
        cane.dormi(); 
        cane.mangia();
        cane.verso();
        System.out.println();

        System.out.println(" --- Delfino --- ");
        Animale delfino = new Delfino();
        delfino.dormi();
        delfino.mangia();
        delfino.verso();
        System.out.println();

        System.out.println(" --- Passerotto --- ");
        Animale passerotto = new Passerotto();
        passerotto.dormi();
        passerotto.mangia();
        passerotto.verso();
        System.out.println();

    }

}
