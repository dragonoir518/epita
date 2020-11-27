package org.epita.tp.maison;

public class Main {
    public static void main(String[] args) {
        Maison maison = new Maison();
        System.out.println(maison);
        for (int i = 0; i < 10; i++) {
            maison.chauffer();
        }
        System.out.println("après Chauffrer 10 fois "+maison);

        Datacenter datacenter = new Datacenter();
        System.out.println("Température initial du datacenter "+datacenter);

        datacenter.refroidir();
        System.out.println("Après le refroidissement du datacenter "+datacenter);
    }
}
