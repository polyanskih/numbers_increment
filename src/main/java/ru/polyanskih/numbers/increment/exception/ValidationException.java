package ru.polyanskih.numbers.increment.exception;

import ru.polyanskih.numbers.increment.model.enums.IncrementErrors;

public class ValidationException extends RuntimeException{

    private final IncrementErrors incrementErrors;

    public ValidationException(IncrementErrors incrementErrors){
        this.incrementErrors = incrementErrors;
    }

    public IncrementErrors getIncrementErrors() {
        return incrementErrors;
    }
}
