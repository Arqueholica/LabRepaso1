package com.repaso.e1;

import java.util.Scanner;

public class Ibiza {
    /*
    Crear array con nombres random
    forear el array e ifelsear
    tiene que estar la condicion random matemática (variable?¿)

    scanear para preguntar si se quiere iniciar, y luego seguir o parar
     */

    Scanner scanner = new Scanner(System.in);

    String[] participantes = {"Alain", "Jose", "Antonia", "MariCruz", "Edelmetria"};


    public void ganador(){
        for (int i = 0; i < participantes.length ; i++) {
            System.out.println(participantes[i]);
        }

    }

}
