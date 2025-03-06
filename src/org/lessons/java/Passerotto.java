package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Passerotto extends Animale implements IVolante{

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    public void mangia() {
        System.err.println("Mangia semi");
    }

    @Override
    public void verso() {
        System.out.println("Cinguetta");
    }
    
}
