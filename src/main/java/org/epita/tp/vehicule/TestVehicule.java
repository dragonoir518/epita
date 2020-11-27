package org.epita.tp.vehicule;

public class TestVehicule {
    public static void main(String[] args) {
        Velo monVelo = new Velo();

        //monVelo.toString();
        System.out.println(monVelo);

        Vehicule monTrain = new Train(100);
        //monTrain.toString();
        System.out.println(monTrain);
    }
}
