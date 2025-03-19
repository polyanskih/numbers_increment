package ru.polyanskih.numbers.increment.model;

import java.util.List;

public class IncrementRequest {
    private List<Long> numbers;

    public List<Long> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Long> numbers) {
        this.numbers = numbers;
    }
}
