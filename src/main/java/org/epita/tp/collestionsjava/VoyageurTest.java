package org.epita.tp.collestionsjava;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;


public class VoyageurTest {

    public static void main(String[] args) {
        Voyageur v1 = new Voyageur(1, 2, "Toto", Classe.BUSINESS);
        Voyageur v2 = new Voyageur(2, 4, "Titi", Classe.PREMIERE);
        Voyageur v3 = new Voyageur(3, 6, "Tata", Classe.ECO);
        Voyageur v4 = new Voyageur(4, 1, "Tutu", Classe.ECO);

        Queue<Voyageur> lesVoyageurs = new PriorityQueue<>();

        lesVoyageurs.add(v1);
        lesVoyageurs.add(v2);
        lesVoyageurs.add(v3);
        lesVoyageurs.add(v4);

        System.out.println(lesVoyageurs);
        Integer.compare(1,2);
        int size = lesVoyageurs.size(); //ne pas mettre ça dans for, car poll supprimer l'élement
        //priorityQueue rend l'ordre uniquement au restitution
        for (int i = 0; i < size; i++) {
            System.out.println(lesVoyageurs.poll()); //poll récupère le première élement le plus impotant.

        }


    }


}
