package org.lessons.java;

import org.lessons.java.interfaces.INuotante;

public class Delfino extends Animale implements INuotante{

    @Override
    public void nuota(){
        System.out.println("Sto nuotando!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesce");        
    }

    @Override
    public void verso() {
        System.out.println("Fischia");        
    }
    
}
