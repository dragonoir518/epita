package org.epita.tp.enumeration;

public class JoursSemaineTest {
    public static void main(String[] args) {

/*

        for (JoursSemaine js : JoursSemaine.values()) {
            System.out.println(js.name() + " "+js);

        }
*/

        JoursSemaine[] jours = JoursSemaine.values();
        for (int i = 0; i < jours.length; i++) {
            System.out.println(jours[i].name()+ " "+jours[i]);
        }

        int numJourJeudi = JoursSemaine.JEUDI.ordinal();
        int numJourSamedi = JoursSemaine.SAMEDI.ordinal();

        System.out.println(numJourJeudi);
        System.out.println(numJourSamedi);

    }
}
