package org.epita.tp.serie2.backtracking;

public class Dame {

    private int ligne;
    private int colonne;
    private char[][] plateau;
    private char[][] plateauCopied;

    public Dame(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.plateau = new char[ligne][colonne];
    }

    public Dame(char[][] plateau) {
        plateauCopied= plateau.clone();
    }


    public char[][] copierPlateau(char[][] plateau) {
        char[][] plateauCopied = new char[4][4];
        plateauCopied= plateau.clone();

        return plateauCopied;

    }

    public char[][] getPlateauCopied() {
        return plateauCopied;
    }

    public void afficherPlateau(char[][] plateau) {
        for (int i = 0; i < plateau.length; i++) {
            if (i == 0) {// afficher indicateur colonne
                for (int indice = 1; indice <= plateau.length; indice++) {
                    System.out.print(" " + indice);//afficher numéro colonne
                }
            }


           // System.out.println("\n ----------");
            System.out.println();
            for (int j = 0; j < plateau[i].length; j++) {
                if (j == 0) {
                    //afficher indicateur ligne
                    System.out.print(i + 1);
                }
                System.out.print("|");
                System.out.print(plateau[i][j]);

                if (j == (plateau.length - 1)) {//on afficher le dernier | du tableau
                    System.out.print("|");
                }

            }
            //ajout dernier ligne du tableau

          /*  if (i == (plateau.length - 1)) {
                System.out.println("\n ----------");
            }*/
        }
    }

    public boolean estSurLaMemeColonneQue(Dame dameCible) {
        return true;
    }

    public boolean estSurLaMemeLigneQue(Dame dameCible) {
        return true;
    }

    public boolean estSurLaMemeDiagonaleDroiteQue(Dame dameCible) {
        return true;
    }

    public boolean estSurLaMemeDiagonaleGaucheQue(Dame dameCible) {
        return true;
    }

    public boolean peutManger(Dame dameCible) {
        return true;
    }

}
