package ru.polyanskih.numbers.increment.exception;

import ru.polyanskih.numbers.increment.model.enums.IncrementError;

public class ValidationException extends RuntimeException{

    private final IncrementError incrementError;

    public ValidationException(IncrementError incrementError){
        this.incrementError = incrementError;
    }

    public IncrementError getIncrementErrors() {
        return incrementError;
    }
}
