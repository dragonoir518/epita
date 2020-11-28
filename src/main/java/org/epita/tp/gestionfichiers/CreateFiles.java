package org.epita.tp.gestionfichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateFiles {

    public static void createSampleFile(String pathFile, ArrayList<String> contenu) throws IOException {

        Path path= Paths.get(pathFile);
        boolean exist = Files.exists(path);
        if(!exist) {
            Files.createFile(path);
            Files.write(path, contenu, StandardOpenOption.APPEND);
        }
    }

    public static String motPlusUtilise(Map<String, Integer> mapResultat) {
        int max=0;
        String motLePlusUtilise="";
       // Map<String, Integer> mapResultat = new HashMap<>();

        for (Map.Entry mapMots : mapResultat.entrySet()) {
          if((int)mapMots.getValue()>max) {
              max= (int) mapMots.getValue();
              motLePlusUtilise= (String) mapMots.getKey();
          }

        }
       return motLePlusUtilise;

    }
    public static Map nombreOccurencesWordInFile(String pathFile) throws IOException {
        Path path = Paths.get(pathFile);
        boolean exist = Files.exists(path);
        Map<String,Integer> mapMotsValeurs= new HashMap<>();

        if(exist) {
            ArrayList<String> tableauDesMots = recupererListeMots(path);
            //compter chaque mot et mettre le résultat dans Map(key,valeur)

                for (int i = 0; i < tableauDesMots.size(); i++) {
                    int compteurMot = 0;
                    for(int j=0;j< tableauDesMots.size();j++) {
                        if(tableauDesMots.get(i).equals(tableauDesMots.get(j)))          {
                            compteurMot=compteurMot+1;
                        }
                    }
                  mapMotsValeurs.put(tableauDesMots.get(i),compteurMot);
                }
            //System.out.println(mapMotsValeurs);
        }
       return mapMotsValeurs;
    }



    private static ArrayList<String> recupererListeMots(Path path) throws IOException {

        //lire le fichier
        List<String> lignesFichier = null;
        lignesFichier = Files.readAllLines(path);
        ArrayList<String> tableauDesMots = new ArrayList<>();
        //mettre chaque mot dans un tableau
        for (int i = 0; i < lignesFichier.size(); i++) {
            String[] mots = lignesFichier.get(i).toLowerCase().split(" ");

          for (int j = 0; j < mots.length; j++) {
                String motNettoyage=mots[j];
                tableauDesMots.add(motNettoyage.replaceAll("[.,\\-!?]",""));
          }
        }

        return tableauDesMots;
    }
}