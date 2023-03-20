/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tpargentinaprograma;

import static com.mycompany.tpargentinaprograma.Utils.getFile;
import static com.mycompany.tpargentinaprograma.Functions.comparePronosticWithResult;
import java.io.IOException;
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
        List<String> round = getFile("src\\main\\java\\com\\mycompany\\resources\\rounds\\round1.csv");
        List<String> pronostic = getFile("src\\main\\java\\com\\mycompany\\resources\\pronostics\\pronostic1.csv");
        comparePronosticWithResult(round, pronostic);
    }

}
