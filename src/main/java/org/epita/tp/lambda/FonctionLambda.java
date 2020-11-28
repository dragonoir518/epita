package org.epita.tp.lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.pow;

public class FonctionLambda {
    /*
     * fonction lambda dans Java 8
     * (paramètres) -> expression;
     * (paramètres) -> { traitements; }
     * Ex.
     * Consumer<String> afficher = (param) -> System.out.println(param);
     * Consumer<String> afficher = param -> System.out.println(param);
     * Consumer<String> afficher = () -> System.out.println("Hello World");
     * */

    public static void main(String[] args) {
        ArrayList<String> malist = new ArrayList<>();
        malist.add("Toto");
        malist.add("Titi");
        malist.add("Tata");
        malist.add("Tutu");
        malist.add("Tete");

        // pour afficher
        for (int i = 0; i < malist.size(); i++) {
            System.out.println(malist.get(i));
        }

        //avec la fonction lambda

        malist.forEach((x)-> System.out.println(x));  // ou bien      => malist.forEach(System.out::println);



        //---------------------------------------------------------------------------------


        //Pour utiliser la fonction lambda, il faut que l'Interface soit fonctionnelle et possède une seule méthode
        Calculable calculModulo = (a,b) -> { return a%b;};
        Calculable calculMultiply = (a,b) -> { return a*b;};

        int i = calculModulo.calculer(5, 6);
        System.out.println("valeur Modulo=>"+i);

        int x = calculMultiply.calculer(2,3);
        System.out.println("Valeur Multiplication=>"+x);

    }

}




