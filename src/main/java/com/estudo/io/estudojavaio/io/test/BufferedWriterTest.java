package com.estudo.io.estudojavaio.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\file\\FileWriterTest.txt");

        try {
            if (file.exists()) {
                FileWriter fileWriter = new FileWriter(file, true);

                //Buffered writer é otimizado, ao invés de escrever direto no arquivo, vai ser guardado em memória
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Buffered Writer Test 23532523");

                //FileWriter usa \n para pular linha, mas nem todos os sistemas operacionais entendem isso
                //Já o BufferedWriter tem o recurso newLine()
                bufferedWriter.newLine();
                bufferedWriter.flush();
                fileWriter.close();

                System.out.println("Success... Buffered Writer");
            }
        }catch (IOException e) {
            throw new IOException(e);
        }
    }
}
