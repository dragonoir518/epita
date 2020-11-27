package org.epita.tp.codewars;

public class Troll {
    public static String disemvowel(String str) {
        String msgReturn="";
        /*
        for(char c : str.toCharArray()) {
            if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u' ||
               c=='A' || c=='E' || c=='O' || c=='I' || c=='U') {
                msgReturn=msgReturn;
            }
            else {
                msgReturn+=c;
            }
        }
        */
        msgReturn= str.replaceAll("[aeioiuAEIOUàéëùè]","");
     return msgReturn;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("Où es tu coucou!"));
    }
}