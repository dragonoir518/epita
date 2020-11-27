package org.epita.tp.statics;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

//singleton
public class Dictionnaire {

    private static String nom;
    private static Dictionnaire dictionnaire;

    private Dictionnaire(String nomTitre) {
        nom=nomTitre;
    }

    public static Dictionnaire getInstance() {
        if(dictionnaire == null) {
            dictionnaire = new Dictionnaire("Larousse");
        }

        return dictionnaire;
    }

}
