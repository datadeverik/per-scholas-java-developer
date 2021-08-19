package org.perscholas.lectures.w4.d2.generics;

public class GenericKeyValue<key, value> {

    private key k;
    private value v;

    public GenericKeyValue(key k, value v) {
        this.k = k;
        this.v = v;
    }
}


