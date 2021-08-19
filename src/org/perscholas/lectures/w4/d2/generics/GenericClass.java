package org.perscholas.lectures.w4.d2.generics;

public class GenericClass <Datatype> {

    private Datatype varName;

    public GenericClass(Datatype varName) {
        this.varName = varName;
    }

    public GenericClass() {

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
