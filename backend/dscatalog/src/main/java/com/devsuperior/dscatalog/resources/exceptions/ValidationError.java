package com.devsuperior.dscatalog.resources.exceptions;


import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String message,String fieldName){
        errors.add(new FieldMessage(message,fieldName));
    }
}
