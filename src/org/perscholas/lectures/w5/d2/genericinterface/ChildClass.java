package org.perscholas.lectures.w5.d2.genericinterface;

public class ChildClass {
    GenericInterface<Integer> compareTwoVar = new GenericInterface<Integer>() {
        @Override
        public Integer compare(Integer a, Integer b) {
            if(a > b) {
                return a;
            }
            else {
                return b;
            }
        }
    };

    GenericInterface<String> compareTwoString = new GenericInterface<String>() {
        @Override
        public String compare(String a, String b) {
            if (a.compareToIgnoreCase(b) > 0) {
                return a;

            } else {
                return b;
            }
        }
    };
}
