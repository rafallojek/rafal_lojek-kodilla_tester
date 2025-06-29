package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(int amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int expectedAmount) {
        assertEquals(expectedAmount, cashSlot.getContents());
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents());
    }

    @Then("wallet balance should remain ${int}")
    public void wallet_balance_should_remain(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }

    @When("I deposit ${int}")
    public void i_deposit(int amount) {
        wallet.deposit(amount);
    }

    @Then("wallet balance should be ${int}")
    public void wallet_balance_should_be(int expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }
}
