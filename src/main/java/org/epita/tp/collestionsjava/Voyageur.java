package org.epita.tp.collestionsjava;

public class Voyageur implements Comparable {
    private final int numeroVoyageur;
    private final int numeroSiege;
    private final String nom;
    private final Classe classe;

    public Voyageur(int numeroVoyageur, int numeroSiege, String nom, Classe classe) {
        this.numeroVoyageur = numeroVoyageur;
        this.numeroSiege = numeroSiege;
        this.nom = nom;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "numeroVoyageur=" + numeroVoyageur +
                ", numeroSiege=" + numeroSiege +
                ", nom='" + nom + '\'' +
                ", classe=" + classe +
                '}';
    }

    public Classe getClasse() {
        return classe;
    }

    public int getNumeroSiege() {
        return numeroSiege;
    }

    @Override
    public int compareTo(Object o) {
        Voyageur compare = (Voyageur) o;
        int i = this.classe.compareTo(compare.getClasse());
        if(i==0 ) {
            //meme classe,
            return  this.numeroSiege - compare.getNumeroSiege();
        }
        return i;

    }
}
