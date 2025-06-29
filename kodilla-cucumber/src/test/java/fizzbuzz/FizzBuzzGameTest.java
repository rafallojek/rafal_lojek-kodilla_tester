package fizzbuzz;

import com.kodilla.fizzbuzz.FizzBuzzGame;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @ParameterizedTest(name = "For the number {0} expected result is {1}")
    @CsvSource({
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz",
            "2, None",
            "30, FizzBuzz",
            "9, Fizz",
            "10, Buzz",
            "7, None"
    })
    void testFizzBuzz(int number, String expectedResult) {
        // Given
        // When
        String result = FizzBuzzGame.checkNumber(number);
        // Then
        assertEquals(expectedResult, result);
    }
}
