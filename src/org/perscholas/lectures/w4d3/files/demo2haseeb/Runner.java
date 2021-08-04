package org.perscholas.lectures.w4d3.files.demo2haseeb;

import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Java IO PAckage
        String fname = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\DataChicago_two.txt";
        String fname_two = "Demo.txt";
        File f  = new File(fname);
        System.out.println( f.isAbsolute());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());

        if(f.exists())
        {
            System.out.println("File is Found");
            System.out.println("file is Writeable : " + f.canWrite());
            System.out.println("File is Readable: " + f.canRead());
            System.out.println("File Size: " + f.length());

        }
        else {
            //System.out.println("File is not found");
            //throw new FileNotFoundException("File is not found");
            try {
                boolean newFile = f.createNewFile();
                if(newFile)
                {
                    System.out.println("File name is : " + f.getName());
                }
            }
            catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


        }


    }
}