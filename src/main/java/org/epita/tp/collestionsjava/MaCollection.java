package org.epita.tp.collestionsjava;

import java.util.*;

public class MaCollection {
    public static void main(String[] args) {
        List<String> maList = new ArrayList<>();
        maList.add("3Toto");
        maList.add("1Titi");
        maList.add("2Tata");
        afficher(maList);

        maList.sort(null);
        afficher(maList); //trier


        //utiliser TreeSet qui gère le tri automatiquement.
        Set<String> listPersonSorted = new TreeSet<>();
        listPersonSorted.add("Macron");
        listPersonSorted.add("Ava");
        listPersonSorted.add("Dupont");
        listPersonSorted.add("Duront");
        System.out.println(listPersonSorted);

        //exo 5 tableau à 2 dimension avec implémentation de l'interface List
        List<List<String>> listeDoubleDimension = new ArrayList<>();
        listeDoubleDimension.add(new ArrayList<String>());
        listeDoubleDimension.get(0).add("toto");
        listeDoubleDimension.get(1).add("titi");
        System.out.println(listeDoubleDimension);

    }

    private static void afficher(List<String> maList) {
        System.out.println(maList);
    }

}
