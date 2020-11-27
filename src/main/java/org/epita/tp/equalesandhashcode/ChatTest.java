package org.epita.tp.equalesandhashcode;

public class ChatTest {
    public static void main(String[] args) {
        //instanciations
        Chat felix = new Chat("Felix",3,'M');
        Chat max   = new Chat("Max",3,'M');

        Chat toto = new Chat("Toto",3,'F');
        Chat titi = new Chat("Toto",3,'F');

        System.out.println(felix);
        System.out.println(max);

        if(felix.equals(max)) {
            System.out.println("felix = max equals");
        }
        else
        {
            System.out.println("felix != max !equals");
        }

        int hashfelix = felix.hashCode();
        int hashmax   = max.hashCode();

        System.out.println("felix hashcode "+hashfelix);
        System.out.println("Max hashcode "+hashmax);

        System.out.println("--------------------------");
        System.out.println(toto);
        System.out.println(titi);


        //toto = titi => meme nom, age et sexe
        if(toto.equals(titi)) {
            System.out.println("toto equals titi => meme nom, age et sexe");
        }
        else
        {
            System.out.println("toto !equals titi");
        }

        // hashcode de tototiti
        System.out.println("toto hashcode "+toto.hashCode());
        System.out.println("titi hashcode "+titi.hashCode());



        int a = 20;
        System.out.println("variable a "+a);
        String testZero="00";
        String testComb = testZero + Integer.toString(a);
        System.out.println(testComb);

    }
}
