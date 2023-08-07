package com.estudo.io.estudojavaio.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileDirectory {
    public static void main(String[] args) throws IOException {
        try {
            File fileDirectory = new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\directory");
            //Criar diretório
            fileDirectory.mkdir();


            //Criar arquivo dentro do diretório criado
            File file = new File(fileDirectory, "file.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Teste 123");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();

            //Renomear o arquivo
            File fileRenamed = new File(fileDirectory,"file_renamed.txt");
            file.renameTo(fileRenamed);



        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
