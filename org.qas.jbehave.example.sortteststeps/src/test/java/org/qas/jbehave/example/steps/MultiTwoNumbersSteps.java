package org.qas.jbehave.example.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.qas.jbehave.example.Calculator;


public class MultiTwoNumbersSteps {
    private Calculator calculator3;
    private Calculator calculator3_1;
    private Calculator calculator3_2;

    //Scenario 1
    @Given("I have a calculator")
    public void givenIHaveACalculator() {
        calculator3 = new Calculator();
    }

    @When("I multi <number5> and <number6>")
    public void whenIMultiNumber5AndNumber6(@Named("number5")int number5, @Named("number6")int number6) {
        calculator3.multi(number5, number6);
    }

    @Then("the multi outcome should <multiresult>")
    public void thenTheMultiOutcomeShould(@Named("multiresult")int multiresult) {
        assert calculator3.getMultiResult() == multiresult;
    }

    //Scenario 2
    @Given("I have first calculator")
    public void givenIHaveACalculator_1() {
        calculator3_1 = new Calculator();
    }

    @When("I multi <number5_1> and <number6_1>")
    public void whenIMultiNumber5_1AndNumber6_1(@Named("number5_1")int number5_1, @Named("number6_1")int number6_1) {
        calculator3_1.multi(number5_1, number6_1);
    }

    @Then("the multi outcome should <multiresult_1>")
    public void thenTheMultiOutcomeShould_1(@Named("multiresult_1")int multiresult_1) {
        assert calculator3_1.getMultiResult() == multiresult_1;
    }

    //Scenario 3
    @Given("I have second calculator")
    public void givenIHaveACalculator_2() {
        calculator3_2 = new Calculator();
    }

    @When("I multi <number5_2> and <number6_2>")
    public void whenIMultiNumber5_2AndNumber6_2(@Named("number5_2")int number5_2, @Named("number6_2")int number6_2) {
        calculator3_2.multi(number5_2, number6_2);
    }

    @Then("the multi outcome should <multiresult_2>")
    public void thenTheMultiOutcomeShould_2(@Named("multiresult_2")int multiresult_2) {
        assert calculator3_2.getMultiResult() == multiresult_2;
    }
}
