package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FizzBuzzSteps {

    private int number;
    private String result;

    @Given("I have the number {int}")
    public void i_have_the_number(Integer int1) {
        this.number = int1;
    }

    @When("I check the FizzBuzz result")
    public void i_check_the_fizz_buzz_result() {
        if (number % 15 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "None";
        }
    }

    @Then("I should get {string}")
    public void i_should_get(String expected) {
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}
