package ru.polyanskih.numbers.increment.exception;

import ru.polyanskih.numbers.increment.model.IncrementErrors;

public class ValidationException extends RuntimeException{

    public IncrementErrors getIncrementErrors() {
        return incrementErrors;
    }

    private final IncrementErrors incrementErrors;

    public ValidationException(IncrementErrors incrementErrors){
        this.incrementErrors = incrementErrors;
    }
}
