/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpargentinaprograma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Meier
 */
public class Utils {
     public static List<String> getFile(String path) throws IOException {
        String archivo = path;
        return Files.readAllLines(Paths.get(archivo));
    }
}
