package com.estudo.io.estudojavaio.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        //Path é uma interface
        //Paths é uma classe
        //Há várias formas de pegar o path
        //Quando se trabalha com o Java NIO, não se usa a classe File do IO e sim a interface Path e as classes Paths e Files
        Path pathDirectory = Paths.get("src/main/resources/static/test_directory");
        Path pathSubDirectory = Paths.get("src/main/resources/static/sub_directory/sub_sub_directory");
        if (Files.notExists(pathDirectory)){
            Files.createDirectory(pathDirectory);
            System.out.println("Directory created");
        }
        if (Files.notExists(pathSubDirectory)) {
            //createDirectories cria pastas e sub-pastas
            Files.createDirectories(pathSubDirectory);
            System.out.println("Directories created");
        }
        Path pathFileCreated = Paths.get(pathSubDirectory.toString(), "file_path.txt");
        if (Files.notExists(pathFileCreated)) {
            Files.createFile(pathFileCreated);
        }

        //Copiar o arquivo
        Path source = Paths.get(pathFileCreated.toString());
        Path target = Paths.get(pathSubDirectory.toString(), "file_path_copy.txt");

        //REPLACE_EXISTING serve para dar replace no conteúdo do arquivo de origem para o arquivo destino
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }


}
