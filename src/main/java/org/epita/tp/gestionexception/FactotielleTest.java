package org.epita.tp.gestionexception;

public class FactotielleTest {
    public static void main(String[] args) {
       int a;
        try {
            a = Factorielle.calculerFactorielle(14);
            System.out.println("résultat factorielle "+a);
        } catch (FactorielleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bon week-end lol");
        }

        int b;
        try {
            a = Factorielle.calculerFactorielle(-1);
            System.out.println("résultat factorielle "+a);
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
    }

}
