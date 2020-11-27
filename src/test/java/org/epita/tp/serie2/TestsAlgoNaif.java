package org.epita.tp.serie2;

import org.epita.tp.serie1.ExercicesSupplementaires;
import org.epita.tp.serie2.backtracking.Dame;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.setLenientDateParsing;
import static org.epita.tp.serie2.backtracking.Dame.*;

public class TestsAlgoNaif {
    private static Dame dame;
    private static char[][] plateau = new char[][]{ {'X','O','X','O'}, {'X','O','X','O'}, {'X','O','X','O'}, {'X','O','X','O'} };

    @Test
    @BeforeAll
    @Disabled("à refaire")
    public static void initiliser() {
        Dame maDame = new Dame(4,4);
        dame=maDame;
    }

    @Test
    public void test_exercice1_1() {

        char[][] plateau = new char[][]{ {'X','O','X','O'}, {'X','O','X','O'}, {'X','O','X','O'}, {'X','O','X','O'} };

       // Dame dame = new Dame(4,4);
        char[][] plateauCopied = dame.copierPlateau(plateau);

        System.out.println("Plateau init   adresse=>"+plateau);
        System.out.println("Plateau copied adresse=>"+plateauCopied);

        for (int i = 0; i < plateau.length; i++) {
            for(int j=0; j< plateau.length;j++) {
                assertThat(plateauCopied[i][j]).isEqualTo(plateau[i][j]);
            }
        }
    }

    @Test
    public void test_exercice1_2(){
        //Constructeurs

        //Dame dame1 = new Dame(4,4);



        Dame dame2 = new Dame(plateau);
        char[][] plateauCopied = dame2.getPlateauCopied();
        assertThat(plateauCopied).isEqualTo(plateau);

        for (int i = 0; i < plateau.length; i++) {
            for(int j=0; j< plateau.length;j++) {
                assertThat(plateauCopied[i][j]).isEqualTo(plateau[i][j]);
                System.out.println("Plateau=>"+plateau[i][j]+" PlaeauCopied=>"+plateauCopied[i][j]);
            }
        }

    }

    @Test
    public void test_exercice1_3(){
        //Affichage
        dame.afficherPlateau(plateau);
    }

    @Test
    public void test_exercice1_4(){
        //Ligne
    }

    @Test
    public void test_exercice1_5(){
        //Colonne
    }

    @Test
    public void test_exercice1_6(){
        //Diagonale droite
    }

    @Test
    public void test_exercice1_7(){
        //Diagonale gauche
    }

    @Test
    public void test_exercice1_8(){
        //EstUneSolution
    }

    @Test
    public void test_exercice1_9(){
        //CoupSuivant
    }

    @Test
    public void test_exercice1_10(){
        //Lister les solutions
    }

    @Test
    @Disabled("Pas de tests ici, juste des optimisation qui ne devraient pas faire tomber en erreur les tests précédents")
    public void test_exercice1_11(){
    }
}
