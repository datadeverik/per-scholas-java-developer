package org.perscholas.lectures.w4.d3.files.demojoe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String dirPath = "resources/";
        File dir = new File(dirPath);
        String[] fileNames = dir.list();
        assert fileNames != null;
        for (String path : fileNames) {
            path = "resources/" + path;
            FileWriter fw = new FileWriter(path, true);
            fw.write("Hey!\n");
            fw.write("Blah blah blah\n");
            fw.write("That is all.\n");
            fw.close();
        }
    }
}
