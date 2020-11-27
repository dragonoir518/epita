package org.epita.tp.gestionfichiers;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.epita.tp.gestionfichiers.CreateFiles.*;


public class CreateFilesTest {

    @Test
    void createFichierTest() {
        try {
            ArrayList<String> lignes = new ArrayList<>();

            lignes.add("Colchiques dans les prés");
            lignes.add("Fleurissent, fleurissent");
            lignes.add("Colchiques dans les prés");
            lignes.add("C'est la fin de l'été");
            lignes.add("La feuille d'automne");
            lignes.add("Emportée par le vent");
            lignes.add("En ronde monotone");
            lignes.add("Tombe en tourbillonnant");
            lignes.add("Châtaignes dans les bois");
            lignes.add("Se fendent, se fendent");
            lignes.add("Châtaignes dans les bois");
            lignes.add("Se fendent sous les pas");
            lignes.add("La feuille d'automne");
            lignes.add("Emportée par le vent");
            lignes.add("En ronde monotone");
            lignes.add("Tombe en tourbillonnant");
            lignes.add("Nuage dans le ciel");
            lignes.add("S'étire, s'étire");
            lignes.add("Nuage dans le ciel");
            lignes.add("S'étire comme une aile");
            lignes.add("La feuille d'automne");
            lignes.add("Emportée par le vent");
            lignes.add("En ronde monotone");
            lignes.add("Tombe en tourbillonnant");
            lignes.add("Et ce chant dans mon cœur");
            lignes.add("Murmure, murmure");
            lignes.add("Et ce chant dans mon cœur");
            lignes.add("Murmure le bonheur");


            createSampleFile("monfichier.txt", lignes);

            //supprimer le fichier à la fin de test
//             Path path = Paths.get("monfichier.txt");
//             Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testNombreOccurentMot() {
        try {
           Map<String, Integer> mapResultat = new HashMap<>();
            mapResultat=nombreOccurencesWordInFile("monfichier.txt");

            ArrayList<String> lignes = new ArrayList<>();

            int total=0;
           for (Map.Entry map : mapResultat.entrySet()) {
               lignes.add(map.getKey()+"=>"+map.getValue());
               total=total+ (int)map.getValue();
           }
            lignes.add("Total des mots=>"+total);

            createSampleFile("occurence.txt", lignes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testMotsPlusUtilise() throws IOException {
        Map<String, Integer> mapResultat = new HashMap<>();
        mapResultat=nombreOccurencesWordInFile("monfichier.txt");
        String mot = motPlusUtilise(mapResultat);
        System.out.println(mot);
    }
}
