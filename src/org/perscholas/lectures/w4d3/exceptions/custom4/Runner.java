package org.perscholas.lectures.w4d3.exceptions.custom4;

public class Runner {
    public static void main(String[] args) throws customExecption, InvalidAgException {
        // TODO Auto-generated method stub

        //try {

        //System.out.println("Starting .....");
        //throw new customExecption("This will throw Custom Exception");
        //}
//		catch (customExecption e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}

        TestCustomException ts = new TestCustomException();
        ts.validates(17);

        //ts.validates_two(17);

    }
}