/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpargentinaprograma;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Meier
 */
public class Functions {

    public static void comparePronosticWithResult(List<String> round, List<String> pronostic) throws IOException {
        readResult(round);
        readPronostic(pronostic);
    }

    private static void readResult(List<String> round) throws IOException {
        int iteration = 0;
        for (String result : round) {   
            if (iteration != 0) {     
                System.out.println(Arrays.toString(result.split(";")));
                iteration++;
            }
            iteration++;
        }
    }

    private static void readPronostic(List<String> pronostic) throws IOException {
        
        int iteration = 0;
        for (String result : pronostic) {
            if (iteration != 0) {
                System.out.println(Arrays.toString(result.split(";")));
                iteration++;
            }
            iteration++;
        }
    }
}
