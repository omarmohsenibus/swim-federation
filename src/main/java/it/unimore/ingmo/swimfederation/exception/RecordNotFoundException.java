package it.unimore.ingmo.swimfederation.exception;

public class RecordNotFoundException extends RuntimeException{
    private static final Long serialVersionUID = 1L;
    public RecordNotFoundException(String message){
        super(message);
    }
}
