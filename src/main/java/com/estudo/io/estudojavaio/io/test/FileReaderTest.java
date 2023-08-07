package com.estudo.io.estudojavaio.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\file\\FileWriterTest.txt");

        try {
            FileReader fileReader = new FileReader(file);
            /*

            char[] chars = new char[10];
            fileReader.read(chars);
            for (char c : chars) {
                System.out.print(c);
            }

             */
            int i;

            while ((i=fileReader.read()) != -1) {
                System.out.print((char) i);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
