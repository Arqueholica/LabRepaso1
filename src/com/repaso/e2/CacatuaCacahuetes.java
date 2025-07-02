package com.repaso.e2;

import java.util.Scanner;

public class CacatuaCacahuetes {
    Scanner scanner = new Scanner(System.in);
    String comida = "";


    public void pedir(){

        do{
            System.out.println("¿Qué come la cacatúa?");
            comida = scanner.nextLine();

            if(!comida.equalsIgnoreCase("cacahuetes")){
                System.out.println("CACATÚA CACAHUETES");
                System.out.println("¿Qué come la cacatúa?");
                comida = scanner.nextLine();
                if(!comida.equalsIgnoreCase("cacahuetes")){
                    System.out.println("CACATÚA CACAHUETES");
                }
            }else {
                dormir();
            }

        }while(!comida.equalsIgnoreCase("cacahuetes"));

    }

    public void dormir(){
        System.out.println("Zzzzzz");
    }
}
