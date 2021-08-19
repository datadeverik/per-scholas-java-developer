package org.perscholas.lectures.w4.d2.generics;

public class Main {
    public static void main(String[] args) {
        GenMethod gm = new GenMethod();

        gm.genericDisplay("haseeb"); // it can handle a string
        gm.genericDisplay(1); // it can handle an integer
        gm.genericDisplay(2.35f); // it can also handle a float
        gm.genericDisplay(8.34); // or a double
        gm.genericDisplay(true); // or a boolean
        System.out.println("====");
        GenMethod.staticGenericMethod("Haseeb"); // can accept a String
        GenMethod.staticGenericMethod(3); // or an int, and so on...
        String[] myArr = {"a", "b", "c", "d", "e"};
        gm.printArray(myArr);
        Integer[] myArrTwo = {1, 2, 3, 4, 5}; // must use non-primitive data type with generics
        gm.printArray(myArrTwo);

        System.out.println();
        GenericClass obj = new GenericClass();  // "Raw use of parameterized classd "Generic Class"
        obj.setVarName("PerScholas");
        System.out.println(obj.getVarName());
        obj.setVarName(20178);
        System.out.println(obj.getVarName());

        GenericClass obj2 = new GenericClass("foo");
        System.out.println(obj2.getVarName());
        obj2.setVarName(5);
        System.out.println(obj2.getVarName());

        // Type safety or boundtype
        // Cosntructor boundtype or class level boundtype

        GenericClass<String> objSt = new GenericClass<String>(); // constructor level type safety
        objSt.setVarName("Haseeb");
        System.out.println(objSt.getVarName());
//        objSt.setVarName(34); // wrong data type here
        System.out.println(objSt.getVarName());

        GenericClass<Integer> objInteger = new GenericClass<Integer>();
        objInteger.setVarName(84938);
        System.out.println(objInteger.getVarName());

        GenericBoundType objBound = new GenericBoundType();
        objBound.setVarName(255);
//        objBound.setVarName("PerScholas");

        GenericMultipleParameters objMultiples1 = new GenericMultipleParameters("MyString", 111);
        objMultiples1.printBothValues();

        GenericMultipleParameters objMultiples2 = new GenericMultipleParameters("PerScholas", "Chicago");
        objMultiples2.printBothValues();

        GenericMultipleParameters<Integer, String> objMultiples3 = new GenericMultipleParameters<>();
        objMultiples3.setVarOne(1235);
        objMultiples3.setVarTwo("Var two must be String in this case");

        GenericKeyValue<Integer, String> keyValueObjOne = new GenericKeyValue<>(1, "Haseeb");
        GenericKeyValue<Integer, String> keyValueObjTwo = new GenericKeyValue<>(2, "Jenny");

    }
}
