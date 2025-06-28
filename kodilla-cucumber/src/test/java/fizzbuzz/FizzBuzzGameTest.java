package fizzbuzz;

import com.kodilla.fizzbuzz.FizzBuzzGame;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @ParameterizedTest
    @CsvSource({
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz",
            "7, None",
            "0, FizzBuzz",
            "-3, Fizz",
            "-5, Buzz",
            "-15, FizzBuzz",
            "2, None"
    })
    void shouldReturnExpectedFizzBuzzResult(int input, String expected) {
        assertEquals(expected, FizzBuzzGame.fizzBuzz(input));
    }
}
