package org.epita.tp.serie1;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.epita.tp.serie1.ExercicesSupplementaires.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Test de l'exercice 1")
public class TestsExercicesSupplementaires {

    @Test
    @DisplayName("Test au limit entrée est vide")
    public void test_exercice1() {
        assertThat(ExercicesSupplementaires.exercice1()).isEqualTo(-1);
    }

    @Test
    @DisplayName("Test simple 1,2,3 et 14 en retour")
    void should_14_when_123() {
        assertThat(ExercicesSupplementaires.exercice1(1, 2, 3)).isEqualTo(14);
    }

    @Test
    @DisplayName("Test avec des chiffres négatifs")
    void calculChiffreNegatif() {
        assertThat(ExercicesSupplementaires.exercice1(14, 9, -9, 1, 4, 3)).isEqualTo(384);
    }


    @Test
    @DisplayName("Cas nominal de calcul moyen")
    public void test_exercice2_cas_nominal() {
        assertThat(ExercicesSupplementaires.exercice2(new float[]{11F, 12F, 13F, 14F, 15F, 16F})).isEqualTo(13);
        assertThat(ExercicesSupplementaires.exercice2(new float[]{10F, 20F})).isEqualTo(15);

    }

    @Test
    @DisplayName("Cas argument missing")
    public void test_exercice2_cas_argument_missing() {

        Throwable exception = catchThrowable(
                () -> {
                    ExercicesSupplementaires.exercice2(null);
                }
        );  // ()-> {}  écriture lambda
        assertThat(exception).isNotNull();

    }

    @Test
    @DisplayName("Exo3 cas nominal")
    public void test_exercice3_cas_nominal() {
        assertThat(ExercicesSupplementaires.exercice3(new long[]{1, -2, 10, -15, 3})).isEqualTo(3);
    }

    @Test
    @DisplayName("Exo3 cas 2 egalite positive")
    public void test_exercice3_cas_2_egalites_positives() {
        assertThat(ExercicesSupplementaires.exercice3(new long[]{-10, 10, 3, 10})).isEqualTo(1);
    }

    @Test
    @DisplayName("Exo3 cas 2 egalite positive et negatif")
    public void test_exercice3_cas_2_egalites_positive_negative() {
        assertThat(ExercicesSupplementaires.exercice3(new long[]{-10, 10, 3, -5})).isEqualTo(1);
    }

    @Test
    public void test_exercice4() {
          /*
        f(0) = 0
        f(1) = 1
        f(n) = f(n-1) + f(n-2)

        f(2) = f(0)+f(1) = 1
        f(3) = f(1)+f(2) = 2
        f(10) = f(9)+f(8) = 55
        f(16) = 987
         */
        assertThat(ExercicesSupplementaires.exercice4(0)).isEqualTo(0);
        assertThat(ExercicesSupplementaires.exercice4(16)).isEqualTo(987);
        //System.out.println(ExercicesSupplementaires.exercice4(16));

    }

    @Test
    public void test_exercice5() {
        /*Jessica-Marie-Sue-Hellen est une femme...difficile. Elle n'accepte de sortir qu'avec des hommes selon les critères suivants :

        Âge : Il doit avoir entre 18 et 35 ans
        Physique : Au minimum 8/10
        Revenus annuels : Au minimum 50 000€/an, mais si c'est au delà de 1 000 000€/an, on oublie le reste des critères !
        Ecrire une méthode permettant de modéliser la chance d'un homme à sortir avec Jessica-Marie-Sue-Helen
        21, 9, 60000 -> true
        21, 7, 90000 -> false
        90, 2, 2000000 -> true*/
        assertThat(ExercicesSupplementaires.exercice5(21,9,60000)).isEqualTo(true);
        assertThat(ExercicesSupplementaires.exercice5(21,7,90000)).isEqualTo(false);
        assertThat(ExercicesSupplementaires.exercice5(21,9,2000000)).isEqualTo(true);


    }

    @Test
    public void test_exercice6() {
        /*En général, lorsque vous payer, vous recevez un ticket de carte bleue avec le numéro de votre carte masquée.
        Seuls restent les 4 derniers numéros, le reste étant remplacé par des #.
        Le but de cet exercice est d'écrire une méthode permettant de remplacer tous les caractères d'une chaîne de caractère par des #
        (sauf les 4 derniers).

        123456789012 -> ########9012
        1234 5678 9012 -> ##########9012
        MomNomEstPersonne -> #############onne
        42 -> 42
        */

        assertThat(ExercicesSupplementaires.exercice6("123456789012")).isEqualTo("########9012");
        assertThat(ExercicesSupplementaires.exercice6("1234 5678 9012")).isEqualTo("##########9012");
        assertThat(ExercicesSupplementaires.exercice6("42")).isEqualTo("42");
    }

    @Test
    public void test_exercice7() {
        /*Le but est de prendre un texte et de la convertir soit :

        Tout en majuscules si le texte comprend une majorité de majuscules.
                Tout en minuscules si le texte comprend une majorité de minuscules.
        En cas d'égalité, on ne convertira rien !
        "taTA" -> "taTA"
        "Toto" -> "toto"
        "TITi" -> "TITI"*/

        assertThat(ExercicesSupplementaires.exercice7("taTA")).isEqualTo("taTA");
        assertThat(ExercicesSupplementaires.exercice7("Toto")).isEqualTo("toto");
        assertThat(ExercicesSupplementaires.exercice7("TITi")).isEqualTo("TITI");

    }

    @Test
    public void test_exercice8() {
        /*Soit un tableau d'entiers relatifs. Trouvez le maximum de la multiplication de deux entiers adjacents.

                [1, 2, 3] -> 6
                [9, 5, 10, 2, 24, -1, -48] -> 50
                [-23, 4, -5, 99, -27, 329, -2, 7, -921] -> -14
        Le cas du tableau vide n'est pas à prendre en compte.
        */

        assertThat(ExercicesSupplementaires.exercice8(new int[]{1,2,3})).isEqualTo(6);
        assertThat(ExercicesSupplementaires.exercice8(new int[]{9,5,10,2,24,-1,-48})).isEqualTo(50);
        assertThat(ExercicesSupplementaires.exercice8(new int[]{-23, 4, -5, 99, -27, 329, -2, 7, -921})).isEqualTo(-14);

    }

    @Test
    public void test_exercice9() {

         /*Soit un tableau d'entiers positifs compris entre 0 et 9,
        trouvez chiffre minimum résultat de la combinaison des numéros du tableau.
        Les doublons sont à ignorer.

                [1, 3, 1] -> 13
                [5, 7, 5, 9, 7] -> 579
                [9, 1, 3, 1, 7, 4, 6, 6, 7] -> 134679
        */

        assertThat(ExercicesSupplementaires.exercice9(new int[]{1,3,1})).isEqualTo(13);
        assertThat(ExercicesSupplementaires.exercice9(new int[]{5,7,5,9,7})).isEqualTo(579);
        assertThat(ExercicesSupplementaires.exercice9(new int[]{9, 1, 3, 1, 7, 4, 6, 6, 7})).isEqualTo(134679);
    }

    @Test
    public void test_exercice10() {
        /*Attention, celui-ci n'est pas évident !
        Soit une chaîne de caractère représentant un nombre et un nombre n de virgules. Votre but est de trouver le plus grand chiffre possible après avoir inséré K virgules dans cette chaîne de caractères. Il ne peut pas y avoir deux virgules à la suite.

        '1234',1 = 234 car c'est le max de ('1','234'), ('12','34') et ('123','4').
        '1234',2 = 34 car c'est le max de ('1','2','34'), ('1','23','4') et ('12','3','4').
        '1234',3 = 4
        '2020',1 = 202
        */


        assertThat(ExercicesSupplementaires.exercice10("1234",1)).isEqualTo(234);
        assertThat(ExercicesSupplementaires.exercice10("1234",2)).isEqualTo(34);
        assertThat(ExercicesSupplementaires.exercice10("1234",3)).isEqualTo(4);
        assertThat(ExercicesSupplementaires.exercice10("2020",1)).isEqualTo(202);
        assertThat(ExercicesSupplementaires.exercice10("12345",2)).isEqualTo(345);


    }

    @Test
    public void test_exercice11() {
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
        peutRendre(1,1,1,55) -> false*/
        assertThat(ExercicesSupplementaires.exercice11(0,0,0,50)).isEqualTo(false);
        assertThat(ExercicesSupplementaires.exercice11(2,2,2,200)).isEqualTo(false);
      assertThat(ExercicesSupplementaires.exercice11(1,2,2,10)).isEqualTo(true);
        assertThat(ExercicesSupplementaires.exercice11(1,2,2,80)).isEqualTo(true);
        assertThat(ExercicesSupplementaires.exercice11(1,2,2,90)).isEqualTo(true);
        assertThat(ExercicesSupplementaires.exercice11(0,2,5,80)).isEqualTo(false);
        assertThat(ExercicesSupplementaires.exercice11(1,1,1,55)).isEqualTo(false);

    }

}
