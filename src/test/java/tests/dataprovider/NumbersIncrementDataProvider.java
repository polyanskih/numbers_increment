package tests.dataprovider;

import org.testng.annotations.DataProvider;

import static ru.polyanskih.numbers.increment.model.enums.IncrementError.BODY_FORMAT;
import static ru.polyanskih.numbers.increment.model.enums.IncrementError.EMPTY_NUMBERS;
import static ru.polyanskih.numbers.increment.model.enums.IncrementError.NO_NUMBERS;
import static ru.polyanskih.numbers.increment.model.enums.IncrementError.NULL_NUMBER;

public class NumbersIncrementDataProvider {

    @DataProvider
    public Object[][] incorrectRequest() {
        return new Object[][] {
                {"", BODY_FORMAT},
                {"null", BODY_FORMAT},
                {"{}", NO_NUMBERS},
                {"{\"key\":\"value\"}", NO_NUMBERS},
                {"{\"numbers\": 1}", BODY_FORMAT},
                {"{\"numbers\":[]}", EMPTY_NUMBERS},
                {"{\"numbers\":[1, null, 3]}", NULL_NUMBER},
        };
    }
}
