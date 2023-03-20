/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tpargentinaprograma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Meier
 * @author Thomas
 * @author Uli
 * @author Alan
 * @author Luciano
 */
public class TpArgentinaPrograma {

    public static void main(String[] args) throws IOException {
        List<String> obtenerArchivos = obtenerArchivos("src\\main\\java\\com\\mycompany\\tpargentinaprograma\\Archivos\\archivo.csv");
        System.out.println(obtenerArchivos.size());
        for(String result : obtenerArchivos){
           System.out.println(result);
        };
        
    }

    public static List<String> obtenerArchivos(String path) throws IOException {
        String archivo = path;
        return Files.readAllLines(Paths.get(archivo));  
    }
}
