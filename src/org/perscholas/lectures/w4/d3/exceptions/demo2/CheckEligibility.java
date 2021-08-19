package org.perscholas.lectures.w4.d3.exceptions.demo2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckEligibility {

    public void checkStudentEligibility(int stAge, int stGpa) {
        if (stAge < 18 || stGpa < 2) { // unchecked example
//            System.out.println("Student is not eligible");
            throw new ArithmeticException("Student is not eligible");  // throwing exception explicitly
        } else {
            System.out.println("Student is eligible");
        }
    }

    public void checkFileThrows() throws IOException, FileNotFoundException {
        FileReader fr = new FileReader("foo.bar");
        BufferedReader br = new BufferedReader(fr);

        // print first three lines of file
        for (int counter = 0; counter < 3; counter ++) {
            System.out.println(br.readLine());
        }
    }

    public void checkFileCatches() {
        FileReader fr = null;
        try {
            fr = new FileReader("foo.bar");
            BufferedReader br = new BufferedReader(fr);

            // print first three lines of file
            for (int counter = 0; counter < 3; counter ++) {
                System.out.println(br.readLine());
            }
        }
        catch (FileNotFoundException e) {

            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input Error");
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
