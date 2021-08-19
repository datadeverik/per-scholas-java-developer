package org.perscholas.lectures.w4.d3.files.demostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutDemo {

    public static void main(String[] args) {
        String fname = "resources/byteoutstream.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(fname, true);
            fout.write(100);
            fout.write(101);
            fout.write(65);
            fout.write(66);
            fout.write(64);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
