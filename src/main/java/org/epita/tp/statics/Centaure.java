package org.epita.tp.statics;

public class Centaure {
    public static final int nombreBras = 2;
    public static final int nombrePattes = 4;
    private static int population = 0;


    public static int getPopulation() {
        return population;
    }

    public Centaure() {
        this.population++;
    }

    @Override
    public String toString() {
        return "Nombre de centaure "+population;
    }
}
