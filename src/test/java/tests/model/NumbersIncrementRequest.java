package tests.model;

import java.util.List;

public class NumbersIncrementRequest {
    private List<Long> numbers;

    public NumbersIncrementRequest(List<Long> numbers) {
        this.numbers = numbers;
    }

    public List<Long> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Long> numbers) {
        this.numbers = numbers;
    }

    public static NumbersIncrementRequest numbersIncrementRequest(List<Long> numbers) {
        return new NumbersIncrementRequest(numbers);
    }
}
