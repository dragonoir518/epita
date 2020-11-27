package org.epita.tp.fonctionstring;


import java.util.LinkedHashSet;
import java.util.Set;

public class TestString {
    public static void main(String[] args) {
        String textMin = "texte en miniscule et tu as vu? a a a";
        System.out.println(textMin.toUpperCase()); //mettre en majuscule

        System.out.println(textMin.contains("a"));  //compte le nombre de lettre a
        int cpt=0;

        for (int i = 0; i <textMin.length(); i++) {
            if(textMin.charAt(i)=='a') {
                cpt++;
            }
        }
        System.out.println("Nombre de lettre a dans texte "+cpt +" >>>"+textMin);

        //rempalcer a par 4
        System.out.println(textMin.replace("a","4"));

        //supprimer 5è et 10è caractères
        System.out.println(textMin.substring(0,3)+" "+textMin.substring(10));

        //entier en String
        int num = 5;
        String cing = String.valueOf(num);
        System.out.println(cing);

        //string en int
        String chiffre5 = "5";
        int num5 = Integer.parseInt(chiffre5);
        System.out.println(num5);


        Set unSet = new LinkedHashSet();
    }
}
