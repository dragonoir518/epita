package org.epita.tp.maison;

public class Maison extends Batiment implements AvecChauffage, AvecClimatisation {

    public Maison() {
        super();

    }

    @Override
    public void chauffer() {
        super.temperature++;
    }

    @Override
    public void refroidir() {
        super.temperature--;
    }


}
