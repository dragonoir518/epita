package org.epita.tp.gestionexception;

public class MiroireNombre {
    public static int sortDesc(final int num) {
        if(num<10) {
            return num;
        }
        int temp=0;
        int n = num;

        while(n!=0){

            int reste= n%10;

            temp=temp*10+reste;
            n = n / 10;
        }

        return temp;
    }


}

