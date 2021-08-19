package org.perscholas.lectures.w4.d3.files.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        String fnameOne = "/Users/erikanderson/workspace/helloWRONG.txt";
        String fnameTwo = "hellodemoWRONG.txt";
        File fOne = new File(fnameOne);
        File fTwo = new File(fnameTwo);
        System.out.println("Absolute?: " + fOne.isAbsolute());
        System.out.println("File path: " + fOne.getAbsolutePath());
        System.out.println("Absolute?: " + fTwo.isAbsolute());
        System.out.println("File path: " + fTwo.getAbsolutePath());

        if (fTwo.exists()) {
            System.out.println("fOne is found");
            System.out.println("Is Writeable " + fTwo.canWrite());
            System.out.println("Is readable: " + fTwo.canRead());
            System.out.println("File Length: " + fTwo.length()); // in what units?
        } else {
//            System.out.println("File is not found");
//            throw new FileNotFoundException("File isnot found");  // this feels like an anti-pattern
            System.out.println("Try to create file");
            boolean newFileCreated = fTwo.createNewFile();
            System.out.println("newFileCreated?: " + newFileCreated);
            if (newFileCreated) {
                System.out.println(fTwo.getName());
            }
        }

    }
}
