package org.epita.tp.codewars;

import java.util.Arrays;

public class Kata {
    public static double findUniq(double arr[]) {

        Arrays.sort(arr);


        // Do the magic
        double temp = arr[0];
        int nombreOccurrence=0;
        for (int i = 1; i < arr.length; i++) {
            if(temp != arr[i] && nombreOccurrence==0 ) {
                temp = arr[i];
                nombreOccurrence++;
            }
            nombreOccurrence=0;
        }
        return  temp;//arr[0];
    }


    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0.0, 1.0, 0.0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));

    }

}


