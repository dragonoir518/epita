package org.epita.tp.gestionexception;

public class Factorielle {
    private static int resultatFactorielle=1;

    public Factorielle() {
    }

    public static int calculerFactorielle(int nombre) throws FactorielleException  {
        if(nombre==0) {
            resultatFactorielle = 1;
        }
        if(nombre<0) {
            throw (new NegatifException("Valeur est négative"));
        }
        else {

                    for (int i = 1; i <= nombre; i++) {
                        int temp=resultatFactorielle;
                        resultatFactorielle=resultatFactorielle*i;
                        if (resultatFactorielle/i != temp) {
                            throw (new IncoherenceException("Dépassement de valeur int"));
                        }
            }
        }



        return resultatFactorielle;

    }

}
