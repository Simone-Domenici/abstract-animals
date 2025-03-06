package org.lessons.java;

public class Passerotto extends Animale{

    @Override
    public void mangia() {
        System.err.println("Mangia semi");
    }

    @Override
    public void verso() {
        System.out.println("Cinguetta");
    }
    
}
