package com.estudo.io.estudojavaio.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        //File is created in ./src/main/resources/static/file/
        File file = new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\file\\FileWriterTest.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("Testing...\n");
            fileWriter.flush();
            fileWriter.close();

            System.out.println("Success...");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
