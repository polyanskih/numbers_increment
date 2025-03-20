package ru.polyanskih.numbers.increment.validation;

import ru.polyanskih.numbers.increment.model.enums.IncrementError;
import ru.polyanskih.numbers.increment.exception.ValidationException;
import ru.polyanskih.numbers.increment.model.IncrementRequest;

public class IncrementRequestValidator {
    public static void validateRequest(IncrementRequest incrementRequest) {
        if (incrementRequest.getNumbers() == null) {
            throw new ValidationException(IncrementError.NO_NUMBERS);
        }

        if (incrementRequest.getNumbers().isEmpty()) {
            throw new ValidationException(IncrementError.EMPTY_NUMBERS);
        }

        if (incrementRequest.getNumbers().contains(null)) {
            throw new ValidationException(IncrementError.NULL_NUMBER);
        }
    }
}
