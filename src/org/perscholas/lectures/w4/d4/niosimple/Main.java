package org.perscholas.lectures.w4.d4.niosimple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("resources/data2.txt");
            List<String> data = Files.readAllLines(p);

            for (String s : data) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
