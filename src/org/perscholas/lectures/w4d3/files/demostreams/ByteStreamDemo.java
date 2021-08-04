package org.perscholas.lectures.w4d3.files.demostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        // byte stream

        try {
            FileInputStream fis = new FileInputStream("resources/data.txt");
            int data = fis.read();
            System.out.println((char) data);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }
}
