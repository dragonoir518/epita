package org.epita.tp.enfant;

class TestEnfant {
    public static void main(String[] args) {
        Enfant olivier = new Enfant("Dupont", "Olivier");
        Enfant charlotte = new Enfant("Chenu", "Charlotte");

        charlotte.presentation();

        olivier.presentation();

        for (int i = 0; i < 20; i++) {
            charlotte.feterAnniversaire();
            olivier.feterAnniversaire();

        }

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {

        }

        if (olivier.estAmoureux()) {
       System.out.println(olivier.prenom + " est amoureux");
        }



    }

    private static void testerEnfant(Enfant charlotte, Enfant olivier) {
        charlotte.presentation();
        olivier.presentation();

        charlotte.joueAuBallon(olivier);

        olivier.tomberAmoureux(charlotte);
        charlotte.tomberAmoureux(olivier);
    }
}