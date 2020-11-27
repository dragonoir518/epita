package org.epita.tp.jeuxmorpion;

import java.util.Scanner;

class Morpion {


    public static void initMorpion(char[][] plateau) {
        System.out.println("Jeux de Morpion");
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                plateau[i][j] = ' ';
            }
        }
    }

    public static void afficherTableauMorpion(char[][] tabMorpion) {

        for (int i = 0; i < tabMorpion.length; i++) {
            if (i == 0) {// afficher indicateur colonne
                for (int indice = 1; indice <= tabMorpion.length; indice++) {
                    System.out.print(" " + indice + " ");//afficher numéro colonne
                }
            }


            System.out.println("\n ----------");
            for (int j = 0; j < tabMorpion[i].length; j++) {
                if (j == 0) {
                    //afficher indicateur ligne
                    System.out.print(i + 1);
                }
                System.out.print("|");
                System.out.print(tabMorpion[i][j]);

                if (j == (tabMorpion.length - 1)) {//on afficher le dernier | du tableau
                    System.out.print("|");
                }

            }
            //ajout dernier ligne du tableau
            if (i == (tabMorpion.length - 1)) {
                System.out.println("\n ----------");
            }

        }
    }

    public static boolean verifierGagnant(char[][] tabMorpion) {
        //vérifier si on a un gagant : en ligne, puis en colonne et en diagonal

        boolean gagne = false;
        int tailleTabMorpion = tabMorpion.length;

        // vérifier un gagnant en ligne
        for (int i = 0; i < tabMorpion.length; i++) {
            //balayer la matrice pour vérifier si on a gagner
            for (int j = 0; j < tabMorpion[i].length; j++) {

                if (j == (tailleTabMorpion - 1)) {
                    // vérifier si on a gagné en ligne.
                    if (tabMorpion[i][j] == tabMorpion[i][j - 1]
                            && tabMorpion[i][j] == tabMorpion[i][j - 2]
                            && tabMorpion[i][j] == tabMorpion[i][j - 3]
                            && tabMorpion[i][j] == tabMorpion[i][j - 4]
                            && tabMorpion[i][j] != ' ') {
                        return true;
                    }
                }
            }
        }

        //vérifier un gagnant en colonne
        for (int i = 0; i < tabMorpion.length; i++) {
            for (int j = 0; j < tabMorpion[i].length; j++) {
                if (i == (tabMorpion[i].length - 1)) {

                    if (tabMorpion[i][j] == tabMorpion[i - 1][j]
                            && tabMorpion[i][j] == tabMorpion[i - 2][j]
                            && tabMorpion[i][j] == tabMorpion[i - 3][j]
                            && tabMorpion[i][j] == tabMorpion[i - 4][j]
                            && tabMorpion[i][j] != ' ') {
                        return true;
                    }

                }
            }
        }


        //verifieir si on a gagné en diagonal 5*5
        if ((tabMorpion[0][0] == tabMorpion[1][1] && tabMorpion[0][0] == tabMorpion[2][2] &&
                tabMorpion[0][0] == tabMorpion[3][3] && tabMorpion[0][0] == tabMorpion[4][4] && tabMorpion[0][0] != ' ')
                ||
                (tabMorpion[4][0] == tabMorpion[3][1] && tabMorpion[4][0] == tabMorpion[2][2] &&
                        tabMorpion[4][0] == tabMorpion[1][3] && tabMorpion[4][0] == tabMorpion[0][4] && tabMorpion[2][0] != ' ')) {
            //System.out.println("Gagne=>  diagonal");
            //gagne=true;
            return true;
        }
        return gagne;

    }

    public static void tourDeJeu(char[][] plateau, char symbole) {
        //Ici, on pourrait avoir du code plus complexe :
        //  - Vérifier qu'un utilisateur a bien saisi une entrée valide
        //  - Entrer directement le couple ligne/colonne
        //  - Vérifier qu'un utilisateur n'a pas joué sur une case déjà occupée
        //etc...

        Scanner scanner = new Scanner(System.in);
        afficherTableauMorpion(plateau);
        System.out.println("\nEntrez l'indice de la ligne (1 à 5) => symbole " + symbole);
        int colonne = scanner.next().charAt(0);
        System.out.println("\nEntrez l'indice de la colonne (1 à 5) => symbole " + symbole);
        int ligne = scanner.nextInt();
        int indiceLigne = ligne - 1;
        int indiceColonne = colonne - 49;
        //System.out.println("Entrez la ligne=>"+ indiceLigne);
        //System.out.println("Entrez la colonne=>"+indiceColonne);
        if ((indiceLigne >= 0 && indiceLigne <= plateau.length - 1) && (indiceColonne >= 0 && indiceColonne <= plateau.length - 1)) {
            if (plateau[indiceColonne][indiceLigne] == ' ') {//si case est vide on aurorise
                plateau[indiceColonne][indiceLigne] = symbole;
            } else {
                System.out.println("\nLa case est occupée. Ligne=>" + (indiceLigne + 1) + " colonne=>" + (indiceColonne + 1));
                tourDeJeu(plateau, symbole);
            }

        } else {
            System.out.println("\nIndice doit être entre 1 et 5.");
            tourDeJeu(plateau, symbole);
        }


    }
}
