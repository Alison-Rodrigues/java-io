package com.estudo.io.estudojavaio.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileCreateTest {
    public static void main(String[] args) throws IOException {
        //File is created in ./src/main/resources/static/file/
        File file = new File("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\file\\filetest.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created successfully - " + file.getName());
            }else {
                System.out.println("File already exists - " + file.getName());
                file.delete();
                System.out.println("File deleted");
            }
        }catch (IOException e) {
            throw new IOException(e);
        }

        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Is Path Absolute: " + file.isAbsolute());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Path: " + file.getPath());
        System.out.println("Is hidden: " + file.isHidden());
        System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());


    }
}
