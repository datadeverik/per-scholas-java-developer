package org.perscholas.lectures.w4d3.exceptions.custom2;

public class customExecption extends Exception {
    String st;

    public customExecption(String str)
    {
        super(str);
        this.st = str;

    }

    public String toString()
    {
        return ("Custom Exception Occured: " + this.st);
    }




}