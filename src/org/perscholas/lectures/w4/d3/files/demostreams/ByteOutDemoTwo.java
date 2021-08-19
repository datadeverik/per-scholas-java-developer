package org.perscholas.lectures.w4.d3.files.demostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteOutDemoTwo {

    public static void main(String[] args) {
        String fname = "resources/byteoutstream.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(fname);
//            fout.write(100);
            String s = "Welcome to JavA";
            byte[] data = s.getBytes(StandardCharsets.UTF_8);
            fout.write(data);
//            fout.write(101);
//            fout.write(65);
//            fout.write(66);
//            fout.write(64);
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
