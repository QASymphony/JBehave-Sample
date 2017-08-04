package org.qas.jbehave.example.steps;

import org.qas.jbehave.example.Calculator;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class AddTwoNumbersSteps {
    private Calculator calculator;
    private Calculator calculator_1;
    private Calculator calculator_2;


    //Scenario Math
    @Given("a calculator")
    public void givenACalculator() {
        calculator = new Calculator();
    }

    @When("I add <number1> and <number2>")
    public void whenIAddNumber1AndNumber2(@Named("number1")int number1, @Named("number2")int number2) {
        calculator.add(number1, number2);
    }

    @Then("the add outcome should <addresult>")
    public void thenTheAddOutcomeShould(@Named("addresult")int result) {
        assert calculator.getAddResult() == result;
    }

    //Scenario MoreMath
    @Given("first calculator")
    public void givenACalculator_1() {
        calculator_1 = new Calculator();
    }

    @When("I add <number1_1> and <number2_1>")
    public void whenIAddNumber1_1AndNumber2_1(@Named("number1_1")int number1_1, @Named("number2_1")int number2_1) {
        calculator_1.add(number1_1, number2_1);
    }

    @Then("the add outcome should <addresult_1>")
    public void thenTheAddOutcomeShould_1(@Named("addresult_1")int result_1) {
        assert calculator_1.getAddResult() == result_1;
    }

    //Scenario EvenMoreMatch
    @Given("second calculator")
    public void givenACalculator_2() {
        calculator_2 = new Calculator();
    }

    @When("I add <number1_2> and <number2_2>")
    public void whenIAddNumber1_2AndNumber2_2(@Named("number1_2")int number1_2, @Named("number2_2")int number2_2) {
        calculator_2.add(number1_2, number2_2);
    }

    @Then("the add outcome should <addresult_2>")
    public void thenTheAddOutcomeShould_2(@Named("addresult_2")int result_2) {
        assert calculator_2.getAddResult() == result_2;
    }
}
