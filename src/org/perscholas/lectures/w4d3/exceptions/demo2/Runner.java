package org.perscholas.lectures.w4d3.exceptions.demo2;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) {

        CheckEligibility chk = new CheckEligibility();
//        chk.checkStudentEligibility(16, 3);

//        try {
//            chk.checkFileThrows();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        chk.checkFileCatches();
    }
}
