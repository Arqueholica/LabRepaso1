package com.repaso.e2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculando {
/*
  Switch para las operaciones
  Scanner para pedir qué se quiere
  VARIABLES POR DIOS
 */

    Scanner scanner = new Scanner(System.in);
    String operacion = "";
    double x;
    double y;
    double result;
    String answer;

    public void resultado() {
        System.out.println("¿Quieres realizar una operación matemática? Y/N");
        answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("Y")){

            do{
                System.out.println("¿Qué deseas hacer? Sumar, restar, multiplicar o dividir");
                operacion = scanner.nextLine();
                System.out.println("Escoge el primer número: ");
                x = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Escoge el segundo número: ");
                y = scanner.nextDouble();
                scanner.nextLine();

                switch(operacion){
                    case "sumar":
                        System.out.println(x + y);
                        break;
                    case "restar":
                        System.out.println(x - y);
                        break;
                    case "multiplicar":
                        System.out.println( x * y);
                        break;
                    case "dividir":
                        System.out.println(x / y);
                        break;
                    default:
                        System.out.println("La operación que pides no existe");

                }
                System.out.println("¿Realizar otra operación? Y/N");
                answer = scanner.nextLine();

            }while(answer.equalsIgnoreCase("Y"));

        }else if (answer.equalsIgnoreCase("N")){
            System.out.println("Gracias por participar");
        }

    }
}
