package org.perscholas.lectures.w4d3.files.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        // Java IO PAckage
        String fnameOne = "/Users/erikanderson/workspace/data.txt";    //    String fname_two = "Demo.txt";
        File fObjectOne  = new File(fnameOne);
        System.out.println( fObjectOne.isAbsolute());
        System.out.println(fObjectOne.getAbsolutePath());
        System.out.println(fObjectOne.getParent());

        if(fObjectOne.exists())
        {
            System.out.println("File is Found");
            System.out.println("file is Writeable : " + fObjectOne.canWrite());
            System.out.println("File is Readable: " + fObjectOne.canRead());
            System.out.println("File Size: " + fObjectOne.length());
            Scanner sc = new Scanner(fObjectOne);
            String readLineByLine = sc.nextLine();
            System.out.println(readLineByLine);
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

        }
        else {
            //System.out.println("File is not found");
            //throw new FileNotFoundException("File is not found");
            try {
                boolean newFile = fObjectOne.createNewFile();
                if(newFile)
                {
                    System.out.println("File name is : " + fObjectOne.getName());
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }


    }
}