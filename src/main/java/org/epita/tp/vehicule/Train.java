package org.epita.tp.vehicule;

public class Train extends Vehicule {
    public Train(int nombreRoues) {
        super(nombreRoues);
    }

    @Override
    public String toString() {
        return super.toString() + "TchooTchoo";

    }
//    @Override
//    public void direBonjour() {
//        super.direBonjour();
//        System.out.println("TchooTchoo");
//    }
}
