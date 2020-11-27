package org.epita.tp.codewars;

public class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        String msgReturn="";

        if(names.length==0) {
            msgReturn="no one likes this";
        }
        else if (names.length==1) {
            msgReturn=names[0]+" likes this";
        }
        else if (names.length==2) {
            msgReturn=names[0]+" and "+names[1]+" like this";
        }
        else if(names.length==3) {
            msgReturn=names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        else if(names.length>=4) {
            int nb= names.length-2;
            msgReturn=names[0]+", "+names[1]+" and "+nb+" others like this";
        }

        return msgReturn;
    }

    public static void main(String[] args) {

        System.out.println("no one likes this=>"+whoLikesIt());
        System.out.println("Peter likes this=>"+whoLikesIt("Peter"));
        System.out.println("Jacob and Alex like this=>"+whoLikesIt("Jacob", "Alex"));
        System.out.println("Max, John and Mark like this=>"+whoLikesIt("Max", "John", "Mark"));
        System.out.println("Alex, Jacob and 2 others like this=>"+whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println("Alex, Jacob and 2 others like this=>"+whoLikesIt("Alex", "Jacob", "Mark", "Max","Arnaud","Justine"));

    }
}
