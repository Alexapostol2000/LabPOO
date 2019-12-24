package com.oop_pub.exceptions.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String test = reader.readLine();
            System.out.println("This is how I print what I am reading: " + test);

        } catch (IOException e) {
            System.out.println("incorrect");
            e.printStackTrace();

        } finally {
            reader.close();
        }
        // TODO: Read a line from stdin and print it to stdout
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
    }

    public static void main(String[] args) throws IOException {
        readAndPrintLine();
    }
}
