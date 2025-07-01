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

    String[] participantes = {"Alain", "Jose", "Antonia", "MariCruz", "Edelmetria", "Josefa", "Casiopea", "León", "Haydeé", "Athos"};


    public void ganador(){

        System.out.println("¿Quieres selecciona al afortunado/a que se irá de crucero salvaje por Ibiza? Y/N");
        String answer = scanner.nextLine();


        if(answer.equalsIgnoreCase("Y")){

            do{
                int select = (int) (Math.random() * 10);
                System.out.println("\n" + " El ganador/a es: " + participantes[select]);

                System.out.println("¿Otra vez? Y/N");
                answer = scanner.nextLine();
                if(answer.equalsIgnoreCase("N")){
                    System.out.println("Gracias por participar");
                }

            }while(answer.equalsIgnoreCase("Y"));

        }else if(answer.equalsIgnoreCase("N")){
            System.out.println("Hasta Otra");
        }


    }

}
