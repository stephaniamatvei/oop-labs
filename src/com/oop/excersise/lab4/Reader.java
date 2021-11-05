package com.oop.excersise.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> read(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            File file = new File(
                    "/Users/stephaniamatvei/IdeaProjects/oop_labs/src/com/oop/excersise/lab4/input/"
                    + fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                lines.add(data);
            }
            scanner.close();
            return lines;
        }
        catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            e.printStackTrace();
            return null;
        }
    }
}
