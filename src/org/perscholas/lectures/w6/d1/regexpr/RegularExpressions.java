package org.perscholas.lectures.w6.d1.regexpr;

public class RegularExpressions {
    public static void main(String[] args) {
        // using regular expressions
        //  \s\s to match double spaces
        //  \s{2} to match two spaces
        //  `  ` to match two spaces
        // The tricky point: \s is not valid in java for regex. you need to escape the slash
        // line.split("\\s{2}")
    }
}
