package org.epita.tp.vehicule;

public class Vehicule {
    private int nombreRoues;


    public Vehicule(int nombreRoues) {
        this.nombreRoues = nombreRoues;
    }

    @Override
    public String toString() {
        return "Bonjour, je suis un véhicule à" + nombreRoues + " nombreRoues";
    }

    //public void direBonjour() {
    //     System.out.println("Bonjour, je suis un véhicule à "+nombreRoues+ " roues");
    // }
}
