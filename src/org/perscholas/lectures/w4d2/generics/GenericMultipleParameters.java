package org.perscholas.lectures.w4d2.generics;

public class GenericMultipleParameters <DataTypeOne, DataTypeTwo> {
    private DataTypeOne varOne;
    private DataTypeTwo varTwo;

    GenericMultipleParameters(DataTypeOne varOne, DataTypeTwo varTwo) {
        this.varOne = varOne;
        this.varTwo = varTwo;

    }

    public GenericMultipleParameters() {

    }

    public void printBothValues() {
        System.out.println("Value of varOne: " + this.varOne);
        System.out.println("Value of varTwo: " + this.varTwo);
    }

    public DataTypeOne getVarOne() {
        return varOne;
    }

    public void setVarOne(DataTypeOne varOne) {
        this.varOne = varOne;
    }

    public DataTypeTwo getVarTwo() {
        return varTwo;
    }

    public void setVarTwo(DataTypeTwo varTwo) {
        this.varTwo = varTwo;
    }
}



