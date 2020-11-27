package org.epita.tp.serie1;

import java.util.*;

import static java.lang.Character.isUpperCase;

public class ExercicesSupplementaires {
    public static long exercice1(long...entiers){
        long resultat=0;
        if(entiers.length==0) {
            return -1;
        }
        for (int i = 0; i < entiers.length; i++) {
            resultat+=Math.pow(entiers[i],2);
        }

        return resultat;
    }

    public static int exercice2(float[] decimaux) throws IllegalArgumentException{
        if(decimaux.length==0) {
            throw new IllegalArgumentException("Argument missing");
        }

        float resultat = 0;
        for (int i = 0; i < decimaux.length; i++) {
            resultat+=decimaux[i];

        }
        return (int)resultat/decimaux.length;
    }

    public static int exercice3(long[] entiers){
        long max = 0;
        long min = 0;
        long valeurMax=0;
        int indice = 0;

        for (int i = 0; i < entiers.length; i++) {
            if(i==0) {
                max=entiers[0];
                min=entiers[0];
                continue;
            }
            if(entiers[i]>max) {
                max=entiers[i];
            }
            if(entiers[i]<min) {
                min=entiers[i];
            }

        }
        if(Math.abs(min)>Math.abs(max)) {
            valeurMax=min;
        }
        else {
            valeurMax=max;
        }
        //trouver l'indice de valeurMax
        for (int i = 0; i < entiers.length; i++) {
            if(entiers[i]==valeurMax) {
                indice=i;
                break;
            }
        }

       /* System.out.println("Max=>"+max);
        System.out.println("Min=>"+min);
        System.out.println("Valeur max=>"+valeurMax);*/
        return indice;
    }

    public static long exercice4(int n){
         long[] suiteFibo = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            if(i<2)
            {
                suiteFibo[i]=i;
            }
            else{
                suiteFibo[i]=suiteFibo[i-1]+suiteFibo[i-2];
            }
        }
        //System.out.println(suiteFibo[n]);
        return suiteFibo[n];

    }

    public static boolean exercice5(int age, int pysique, long revenusAnnuels){
        /*Jessica-Marie-Sue-Hellen est une femme...difficile. Elle n'accepte de sortir qu'avec des hommes selon les critères suivants :
        Âge : Il doit avoir entre 18 et 35 ans
        Physique : Au minimum 8/10
        Revenus annuels : Au minimum 50 000€/an, mais si c'est au delà de 1 000 000€/an, on oublie le reste des critères !
        Ecrire une méthode permettant de modéliser la chance d'un homme à sortir avec Jessica-Marie-Sue-Helen
        21, 9, 60000 -> true
        21, 7, 90000 -> false
        90, 2, 2000000 -> true*/
        if(revenusAnnuels>=1000000) { return true;}
        if(revenusAnnuels>=50000 && (age>=18 || age <=35) && (pysique>7)) {
            return true;
        }

        return false;
    }

    public static String exercice6(String numeroClair){

         /*En général, lorsque vous payer, vous recevez un ticket de carte bleue avec le numéro de votre carte masquée.
        Seuls restent les 4 derniers numéros, le reste étant remplacé par des #.
        Le but de cet exercice est d'écrire une méthode permettant de remplacer tous les caractères d'une chaîne de caractère par des #
        (sauf les 4 derniers).

        123456789012 -> ########9012
        1234 5678 9012 -> ##########9012
        MomNomEstPersonne -> #############onne
        42 -> 42
        */
        String numToShow="";
        char[] tableChars= numeroClair.toCharArray();
        if(tableChars.length<4) {
            return numeroClair;
        }

        for (int i = 0; i < tableChars.length; i++) {
        //on a plus de 4 caractères
            if(i<tableChars.length-4) {
                numToShow = numToShow + "#";
            }
            else
            {
                numToShow = numToShow + tableChars[i];
            }
        }

        return numToShow;
    }

    public static String exercice7(String texteMinEtMaj){
        /*Le but est de prendre un texte et de la convertir soit :

        Tout en majuscules si le texte comprend une majorité de majuscules.
                Tout en minuscules si le texte comprend une majorité de minuscules.
        En cas d'égalité, on ne convertira rien !
        "Toto" -> "toto"
        "TITi" -> "TITI"
        "taTA" -> "taTA"*/
        char[] tableauChars = texteMinEtMaj.toCharArray();

        int nombreMajuscule=0;
        int nombreMiniscule=0;
        for (int i = 0; i < tableauChars.length; i++) {
            if(isUpperCase(tableauChars[i])) {
                //la lettre est bien Majuscule
                nombreMajuscule++;
            }
            else
            {
                nombreMiniscule++;
            }
        }

        if(nombreMajuscule==nombreMiniscule) {
            return texteMinEtMaj;
        }
        if(nombreMajuscule>nombreMiniscule) {
            return texteMinEtMaj.toUpperCase();
        }
        return texteMinEtMaj.toLowerCase();

    }

    public static long exercice8(int[] entiers){
          /*Soit un tableau d'entiers relatifs. Trouvez le maximum de la multiplication de deux entiers adjacents.

                [1, 2, 3] -> 6
                [9, 5, 10, 2, 24, -1, -48] -> 50
                [-23, 4, -5, 99, -27, 329, -2, 7, -921] -> -14
        Le cas du tableau vide n'est pas à prendre en compte.
        */
        long max=Long.MIN_VALUE;
        long valeurTemp=0;
        for (int i = 0; i < entiers.length; i++) {
            if(i<entiers.length-1) {
                valeurTemp=entiers[i]*entiers[i+1];
                //System.out.println("ValeurTemp=>"+valeurTemp);
                if(valeurTemp>max) {
                    max=valeurTemp;
                }
            }

        }

        System.out.println("Max=>"+max);
        return max;
    }

    public static long exercice9(int[] entiersPositifs){
        /*Soit un tableau d'entiers positifs compris entre 0 et 9,
        trouvez chiffre minimum résultat de la combinaison des numéros du tableau.
        Les doublons sont à ignorer.

                [1, 3, 1] -> 13
                [5, 7, 5, 9, 7] -> 579
                [9, 1, 3, 1, 7, 4, 6, 6, 7] -> 134679
        */
        Set<Integer> setEntiers= new TreeSet<>();
        //TreeSet supprime les doublons et trié
        for (int i = 0; i < entiersPositifs.length; i++) {
            setEntiers.add(entiersPositifs[i]);
        }

        Iterator iterator = setEntiers.iterator();
        String num="";
        //boucler pour récupérer les élement
        while(iterator.hasNext()) {
            num=num+iterator.next();
        }

        return Long.parseLong(num);
    }

    public static long exercice10(String nombre, int nombreVirgules){
         /*Attention, celui-ci n'est pas évident !
        Soit une chaîne de caractère représentant un nombre et un nombre n de virgules.
        Votre but est de trouver le plus grand chiffre possible après avoir inséré K virgules dans cette chaîne de caractères.
        Il ne peut pas y avoir deux virgules à la suite.

        '1234',1 = 234 car c'est le max de ('1','234'), ('12','34') et ('123','4').
        '1234',2 = 34 car c'est le max de ('1','2','34'), ('1','23','4') et ('12','3','4').
        '1234',3 = 4
        '2020',1 = 202
        */

    /*    ArrayList<Integer> listeNombresDecoupe= new ArrayList();

        for (int i = 1; i < nombre.length(); i++) {
            if(nombreVirgules==1) {
                listeNombresDecoupe.add(Integer.parseInt(nombre.substring(0, i)));
                listeNombresDecoupe.add(Integer.parseInt(nombre.substring(i, nombre.length())));
                //System.out.println("nombre 0->i=" + i + " =>" + nombre.substring(0, i) + "  NombreVirgule=>" + nombre.substring(i, nombre.length()));
            }
            if(nombreVirgules==2){
                int j = i+1;
                if(j<nombre.length()) {
                    listeNombresDecoupe.add(Integer.parseInt(nombre.substring(0, i)));
                    for(int k=j;k<nombre.length();k++) {
                        listeNombresDecoupe.add(Integer.parseInt(nombre.substring(i, k)));
                        listeNombresDecoupe.add(Integer.parseInt(nombre.substring(k, nombre.length())));
                    }
                }
            }
            if(nombreVirgules==3){
                int j = i+1;
                int k = j+1;
                if(k<nombre.length()) {
                    listeNombresDecoupe.add(Integer.parseInt(nombre.substring(0, i)));
                    int var0i=Integer.parseInt(nombre.substring(0, i));
                    listeNombresDecoupe.add(Integer.parseInt(nombre.substring(i, j)));
                    int varij=Integer.parseInt(nombre.substring(i, j));
                    for(int x=j;x<nombre.length();x++) {
                        listeNombresDecoupe.add(Integer.parseInt(nombre.substring(i, x)));
                        int var1= Integer.parseInt(nombre.substring(i, x));
                        listeNombresDecoupe.add(Integer.parseInt(nombre.substring(x, nombre.length())));
                        int var2 =Integer.parseInt(nombre.substring(x, nombre.length()));
                        System.out.println(listeNombresDecoupe);
                    }
                }
            }

        }
        System.out.println(listeNombresDecoupe);
        int maxInt= listeNombresDecoupe
                                    .stream()
                                    .max(Integer::compare)
                                    .get();

        System.out.println(maxInt);


        return maxInt;*/


        long resultat = 0;
        long maxTrouve = 0;
        int longueurMax = nombre.length() - nombreVirgules;
        String aTester = new String();
        for (int i = 0; i < nombreVirgules + 1; i++) {
            aTester = nombre.substring(i, (i + longueurMax));
            System.out.println(aTester);
            resultat = Integer.valueOf(aTester);
            if (maxTrouve < resultat) {
                maxTrouve = resultat;
            }
        }
        return maxTrouve;
    }


    public static boolean exercice11(int pieces10ct, int pieces20ct, int pieces50ct, int totalARendre) {
        /*
        Le but ici est de savoir s'il est possible de rendre la monnaie sur une somme donnée. Pour cela, nous avons 4 paramètres :
        Un nombre de pièces de 10ct
        Un nombre de pièces de 20ct
        Un nombre de pièces de 50ct
        La somme sur laquelle nous devons rendre la monnaie
        On cherche simplement à savoir si le rendu est possible. Il n'est pas nécessaire de trouver le rendu optimal.
        peutRendre(0,0,0,50) -> false
        peutRendre(2,2,2,200) -> false
        peutRendre(1,2,2,10) -> true
        peutRendre(1,2,2,80) -> true
        peutRendre(1,2,2,90) -> true
        peutRendre(0,2,5,80) -> false
        peutRendre(1,1,1,55) -> false
        */
       // System.out.println("10cts=>"+pieces10ct+" 20cts=>"+pieces20ct+" 50cts=>"+pieces50ct+" Somme=>"+totalARendre);
        ArrayList<Integer> listePiecesrendues = new ArrayList<>();




        int[][] listeMonnaiePieces = new int[][]{
                {50, pieces50ct},
                {20, pieces20ct},
                {10, pieces10ct}  };

      //  int totalPiece = 0;
        int nombrePiecesAenlever=0;
        int nombrePicesParValeur=0;
      //  int Monnaie = 0;
        int tempo=totalARendre;

            for (int i = 0; i < listeMonnaiePieces.length; i++) {
                int valeur=listeMonnaiePieces[i][0];
                int nbp=listeMonnaiePieces[i][1];

                nombrePicesParValeur = tempo/listeMonnaiePieces[i][0];
                //tant qu'il reste des montants à rendre et des pièces dispo
                while(tempo/listeMonnaiePieces[i][0]>0 && nombrePicesParValeur<=listeMonnaiePieces[i][1]) {

                    nombrePiecesAenlever = tempo/listeMonnaiePieces[i][0];
                    listeMonnaiePieces[i][1] = listeMonnaiePieces[i][1] - nombrePiecesAenlever;
                    nombrePicesParValeur =listeMonnaiePieces[i][1];
                    tempo=tempo%listeMonnaiePieces[i][0];
                    listePiecesrendues.add(listeMonnaiePieces[i][0]);
                    //System.out.println(listePiecesrendues);

                    if(tempo<=0) {
                        return true;
                    }

                }

            }

        return false;

      /*  for i in range (4):
        while temp//monnaie[i][0] > 0:
                total_pieces = total_pieces + temp//monnaie[i][0]
        monnaie[i][1]= monnaie[i][1] + temp//monnaie[i][0]
        temp=temp%monnaie[i][0]
        if temp <= 0:
        return (monnaie,total_pieces)
*/

        //System.out.println(listePiecesrendues);



    }


}