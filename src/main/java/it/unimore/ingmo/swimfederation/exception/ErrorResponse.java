package it.unimore.ingmo.swimfederation.exception;

import java.util.List;

public class ErrorResponse {
    private final String message;
    private final List<String> details;

    public ErrorResponse(String message, List<String> details){
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getDetails() {
        return details;
    }
}
