package com.devsuperior.dscatalog.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private String fieldName;
    private String message;

    public FieldMessage(){}

    public FieldMessage(String message, String fieldName) {
        this.message = message;
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
