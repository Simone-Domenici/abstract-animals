package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Aquila extends Animale implements IVolante{

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia carne");        
    }

    @Override
    public void verso() {
        System.out.println("Stridisci");        
    }
    
}
