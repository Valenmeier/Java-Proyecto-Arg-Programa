/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpargentinaprograma;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Meier
 */
public class Functions {

    public static void comparePronosticWithResult(List<String> round, List<String> pronostic) throws IOException {
        String[] partidoResult=readResult(round);
        String[] pronosticResult=readPronostic(pronostic);
        int resultPoints=0;
         for (int i = 0; i < partidoResult.length; i++) {
            if(partidoResult[i].equals(pronosticResult[i])){
                resultPoints++;
            }
        }
          System.out.println("TotalPoints:"+ "" +resultPoints);
    }

    private static String[] readResult(List<String> round) throws IOException {
        List<String[]> partidos = new ArrayList<>();

        for (String line : round) {
            String[] cells = line.split(";");
            partidos.add(cells);
        }
        int iteration = 0;
        String[] resultados = new String[partidos.size() - 1];
        for (String[] partido : partidos) {
            if (iteration != 0) {
                Partidos result = new Partidos(partido);
                resultados[iteration - 1] = result.getResult();
            }
            iteration++;
        }
        return resultados;
    }

    private static String[] readPronostic(List<String> pronostics) throws IOException {
        List<String[]> allPronostics = new ArrayList<>();

        for (String line : pronostics) {
            String[] cells = line.split(";");
            allPronostics.add(cells);
        }
        int iteration = 0;
        String[] resultados = new String[allPronostics.size() - 1];
        for (String[] pronostic : allPronostics) {
            if (iteration != 0) {
                Pronostic result = new Pronostic(pronostic);
                resultados[iteration - 1] = result.getPronostic();
            }
            iteration++;
        }
        return resultados;
    }
}
