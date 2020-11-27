package org.epita.tp.maison;

import java.util.Objects;

public class Batiment {
    float temperature;
    int nombrePorte;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batiment batiment = (Batiment) o;
        return Float.compare(batiment.temperature, temperature) == 0 &&
                nombrePorte == batiment.nombrePorte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, nombrePorte);
    }

    public Batiment() {

        this.temperature = 24;
        this.nombrePorte = 2;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "temperature=" + temperature +
                '}';
    }
}
