package ru.polyanskih.numbers.increment.validation;

import ru.polyanskih.numbers.increment.model.enums.IncrementErrors;
import ru.polyanskih.numbers.increment.exception.ValidationException;
import ru.polyanskih.numbers.increment.model.IncrementRequest;

public class IncrementRequestValidator {
    public static void validateRequest(IncrementRequest incrementRequest) {
        if (incrementRequest.getNumbers() == null) {
            throw new ValidationException(IncrementErrors.NO_NUMBERS);
        }

        if (incrementRequest.getNumbers().isEmpty()) {
            throw new ValidationException(IncrementErrors.EMPTY_NUMBERS);
        }

        if (incrementRequest.getNumbers().contains(null)) {
            throw new ValidationException(IncrementErrors.NULL_NUMBER);
        }
    }
}
