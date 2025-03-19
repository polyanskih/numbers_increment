package ru.polyanskih.numbers.increment.model;

import java.util.List;

public class IncrementResponse {

    private final List<Long> numbers;

    public IncrementResponse(List<Long> numbers) {
        this.numbers = numbers;
    }

    public List<Long> getNumbers() {
        return numbers;
    }
}
