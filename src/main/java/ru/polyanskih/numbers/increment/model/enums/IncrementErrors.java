package ru.polyanskih.numbers.increment.model.enums;

public enum IncrementErrors {

    BODY_FORMAT(0, "Неверный формат запроса"),
    NO_NUMBERS(1, "В запросе нет 'numbers'"),
    EMPTY_NUMBERS(2, "Массив 'numbers' пустой"),
    NULL_NUMBER(3, "null в 'numbers'");

    IncrementErrors(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private final int code;
    private final String description;

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
