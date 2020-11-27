package org.epita.tp.gestionexception;

public class FactorielleException extends Exception {  //si RuntimeException alors pas besoin de try catch
    public FactorielleException(String message) {
        super(message);
    }
}
