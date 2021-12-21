package com.example.gestionproduit.exception;

public class ElementNotFoundException extends RuntimeException{

    public ElementNotFoundException() {

        super("L'élément recherché n'a pas été trouvé.");
    }

    public ElementNotFoundException(String message) {
        
        super(message);
    }
}
