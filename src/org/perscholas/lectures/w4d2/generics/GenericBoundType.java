package org.perscholas.lectures.w4d2.generics;

public class GenericBoundType <Datatype extends Integer> {

    private Datatype varName;

    public GenericBoundType(Datatype varName) {
        this.varName = varName;
    }

    public GenericBoundType() {

    }

    public Datatype getVarName() {
        return this.varName;
    }

    public void setVarName(Datatype varName) {
        this.varName = varName;
    }

    public void addingNumber(int a, int b) {
        System.out.println(a +b);
    }
}
