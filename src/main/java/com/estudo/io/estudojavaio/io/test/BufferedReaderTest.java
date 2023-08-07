package com.estudo.io.estudojavaio.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        File file =  new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\file\\FileWriterTest.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line=bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e) {
            throw new IOException(e);
        }
    }
}
