/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpargentinaprograma;

/**
 *
 * @author Meier
 */
public class Partidos {
    private final String equipo1;
    private final String equipo2;
    private final int golesEquipo1;
    private final int golesEquipo2;
    
    public Partidos(String[] partido) {
        equipo1 = partido[0];
        golesEquipo1 = Integer.parseInt(partido[1]);
        golesEquipo2 = Integer.parseInt(partido[2]);
        equipo2 = partido[3];
    }
    
    
   public String getResult(){
       String resultado="empate";
       if(golesEquipo1>golesEquipo2){
           resultado=equipo1;
       }else if(golesEquipo1<golesEquipo2){
            resultado=equipo2;
       }
       return resultado;
   }
}