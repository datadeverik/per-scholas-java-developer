package org.perscholas.lectures.w4d3.files.demo4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFileFromDirectory {

    public static void main(String[] args) throws FileNotFoundException {
        String fName = "/Users/erikanderson/IdeaProjects/perscholas-corejava-exercises-variables/resources";
        // a folder
        File dir = new File(fName);
        String[] allFiles = dir.list();   // dir.listFiles gives the absolute paths.
        System.out.println(Arrays.toString(allFiles));
        ArrayList<String> data = new ArrayList<>();
        assert allFiles != null;
        for (String s: allFiles) {
            File fObject = new File("resources/" + s);
            Scanner sc = new Scanner(fObject);
            while (sc.hasNext()) {
                data.add(sc.nextLine());
            }
        }
        for (String s : data) {
            System.out.println(s);
        }
    }
}
