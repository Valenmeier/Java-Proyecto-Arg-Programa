/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpargentinaprograma;

/**
 *
 * @author Meier
 */
public class Pronostic {

    private final String equipo1;
    private final String equipo2;
    private final String gano1;
    private final String gano2;

    public Pronostic(String[] pronostic) {
        equipo1 = pronostic[0];
        equipo2 = pronostic[4];
        gano1 = pronostic[1];
        gano2 = pronostic[3];
    }
    
    public String getPronostic(){
        if(gano1.equals("X")){
            return equipo1;
        }else if(gano2.equals("X")){
            return equipo2;
        }
        return "empate";
    }
}
