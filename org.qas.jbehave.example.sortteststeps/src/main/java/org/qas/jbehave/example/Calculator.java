package org.qas.jbehave.example;


public class Calculator {
    private int addresult;
    private int subtresult;
    private int multiresult;

    public void add(int number1, int number2) {
        addresult = number1 + number2;
    }

    public void subt(int number3, int number4) {
        subtresult = number3 - number4;
    }

    public void multi(int number5, int number6) {
        multiresult = number5 * number6;
    }

    public int getAddResult() {
        return addresult;
    }

    public int getSubtResult() {
        return subtresult;
    }

    public int getMultiResult() {
        return multiresult;
    }
}
