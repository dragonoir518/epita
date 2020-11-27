package org.epita.tp.statics;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

public class DictionnaireTestSingleton {
    public static void main(String[] args) {
        //System.out.println(Dictionnaire.titre);
        Dictionnaire monDic = Dictionnaire.getInstance();
      //  System.out.println(monDic.titre);

    }
}
