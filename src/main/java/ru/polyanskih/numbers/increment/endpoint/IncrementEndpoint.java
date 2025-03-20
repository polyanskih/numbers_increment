package ru.polyanskih.numbers.increment.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import ru.polyanskih.numbers.increment.exception.ValidationException;
import ru.polyanskih.numbers.increment.model.ErrorResponse;
import ru.polyanskih.numbers.increment.model.IncrementRequest;
import ru.polyanskih.numbers.increment.model.IncrementResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static ru.polyanskih.numbers.increment.model.enums.IncrementError.BODY_FORMAT;
import static ru.polyanskih.numbers.increment.validation.IncrementRequestValidator.validateRequest;

@RestController
@RequestMapping("/numbers")
public class IncrementEndpoint {

    @PostMapping("/increment")
    public IncrementResponse increment(@RequestBody IncrementRequest incrementRequest) {
        validateRequest(incrementRequest);
        List<Long> result = incrementRequest.getNumbers().stream()
                .map(n -> n + 1)
                .toList();
        return new IncrementResponse(result);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    public ErrorResponse handleValidationException(ValidationException e) {
        return new ErrorResponse(e.getIncrementErrors());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorResponse handleException() {
        return new ErrorResponse(BODY_FORMAT);
    }
}
