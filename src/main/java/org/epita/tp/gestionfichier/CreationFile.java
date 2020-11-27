package org.epita.tp.gestionfichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreationFile {

    public static void createSampleFile(String pathFile) throws IOException {
        ArrayList<String> lignes = new ArrayList<>();

        lignes.add("Entête de fichier");
        lignes.add("Contenu");

        Path path= Paths.get(pathFile);
        boolean exist = Files.exists(path);
        if(!exist) {

                Files.createFile(path);
                Files.write(path, lignes, StandardOpenOption.APPEND);

                //lire le fichier
                List<String> lignesFichier = Files.readAllLines(path);
                System.out.println(lignesFichier);

        }
            Files.delete(path);

    }

}
