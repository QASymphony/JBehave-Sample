package org.qas.jbehave.example.steps;

import org.jbehave.core.annotations.*;
import org.qas.jbehave.example.Calculator;


public class SubtTwoNumbersSteps {
    private Calculator calculator2;

    @Given("have a calculator")
    public void givenHaveACalculator() {
        calculator2 = new Calculator();
    }

    @When("I subt <number3> and <number4>")
    public void whenISubtNumber3AndNumber4(@Named("number3")int number3, @Named("number4")int number4) {
        calculator2.subt(number3, number4);
    }

    @Then("the subt outcome should <subtresult>")
    public void thenTheSubtOutcomeShould(@Named("subtresult")int subtresult) {
        assert calculator2.getSubtResult() == subtresult;
    }
}
