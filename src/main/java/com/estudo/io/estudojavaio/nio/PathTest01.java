package com.estudo.io.estudojavaio.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        //Path é uma interface
        //Paths é uma classe
        //Há várias formas de pegar o path
        //Quando se trabalha com o Java NIO, não se usa a classe File do IO e sim a interface Path e as classes Paths e Files
        Path path1 = Paths.get("C:\\opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\directory\\file_renamed.txt");
        Path path2 = Paths.get("C:", "opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\directory", "file_renamed.txt");
        Path path3 = Paths.get("C:", "opt\\projects\\estudo\\estudo-java-io\\src\\main\\resources\\static\\directory\\file_renamed.txt");
        Path path4 = Paths.get("C:", "opt","projects","estudo","estudo-java-io","src","main","resources","static","directory","file_renamed.txt");

        System.out.println(path1.getFileName());
        System.out.println(path2.getFileName());
        System.out.println(path3.getFileName());
        System.out.println(path4.getFileName());
    }
}
