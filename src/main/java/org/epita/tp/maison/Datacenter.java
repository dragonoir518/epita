package org.epita.tp.maison;

public class Datacenter extends Batiment implements AvecClimatisation {


    public Datacenter() {
       super();
    }

    @Override
    public void refroidir() {
        while(super.temperature>20.0) {
            super.temperature--;
        }
    }


}
