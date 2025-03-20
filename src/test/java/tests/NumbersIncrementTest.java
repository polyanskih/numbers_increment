package tests;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import ru.polyanskih.numbers.increment.model.enums.IncrementError;
import tests.dataprovider.NumbersIncrementDataProvider;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static tests.model.NumbersIncrementRequest.numbersIncrementRequest;
import static tests.requests.Requests.numbersIncrement;

public class NumbersIncrementTest extends BaseTest {

    @Test
    public void shouldIncrementNumbers() {
        JsonPath response = numbersIncrement(numbersIncrementRequest(List.of(1L, 2L, 3L)));

        assertThat("Incorrect code", response.getList("numbers", Long.class), equalTo(List.of(2L, 3L, 4L)));
    }

    @Test(dataProvider = "incorrectRequest", dataProviderClass = NumbersIncrementDataProvider.class)
    public void failToIncrementNumbersIncorrectRequest(String body, IncrementError error) {
        JsonPath response = numbersIncrement(body);

        assertThat("Incorrect code", response.get("code"), equalTo(error.getCode()));
        assertThat("Incorrect description", response.get("description"), equalTo(error.getDescription()));
    }
}
