package org.epita.tp.jeuxmorpion;

public class TestMain {
    public static void main(String[] args) {

        char[][] tabMorpion = new char[5][5];
        Morpion morpion = new Morpion();
        morpion.initMorpion(tabMorpion);

        morpion.afficherTableauMorpion(tabMorpion);

        boolean auJoueur1 = true;
        String nom = "";
        char symbole;

        //tant que personne a gnagné alors on boucle sur le jeux
        while (!morpion.verifierGagnant(tabMorpion)) {
            //joueur 1
            if (auJoueur1) {
                nom = "Joueur 1 => symbole X";
                symbole = 'X';
            } else {
                nom = "Joueur 2 => symbole O";
                symbole = 'O';
            }

            System.out.println("Au tour de : " + nom);

            //Exercice 6
            morpion.tourDeJeu(tabMorpion, symbole);

            //On change de joueur (Exercice 5)
            auJoueur1 = !auJoueur1;
        }

        //on a un joueur gagnant, on afficher à nouveau le tableau
        morpion.afficherTableauMorpion(tabMorpion);
        System.out.println("Fin de la partie, un des deux joueurs a un ligne entière");
        System.out.println(nom + " a gagné !");
    }
}
