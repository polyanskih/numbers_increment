package ru.polyanskih.numbers.increment.model;

import ru.polyanskih.numbers.increment.model.enums.IncrementErrors;

public class ErrorResponse {
    private int code;
    private String description;

    public ErrorResponse(IncrementErrors incrementErrors) {
        this.code = incrementErrors.getCode();
        this.description = incrementErrors.getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
