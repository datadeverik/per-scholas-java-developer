package org.perscholas.lectures.w4d3.exceptions.demo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkEligibility {

    public void checkStudentEligibility(int stAge, int gpa)
    {

        // uncheck Example
        if(stAge < 18 && gpa < 2 )
        {
            //System.out.println("You are not Eligible for Registration ");
            throw new NullPointerException("You are not Eligible for Registration");
            // Expilicitly throw an exception using throw operator
        }

        else {
            System.out.println("You are Eligible for Registration");
        }
    }


    // Check Exception: using throws keyword

    public void checkFile() throws IOException, FileNotFoundException
    {
        FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        fileInput.close();
    }

    public void checkFile_two()
    {


        BufferedReader fileInput = null;
        try {

            FileReader file = new FileReader("C:\\test\\a.txt");
            fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 3; counter++)
                System.out.println(fileInput.readLine());

        }

        catch(FileNotFoundException e)
        {
            System.out.println("File not found in a given path");
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            try {
                fileInput.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}