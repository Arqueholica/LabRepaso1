package com.repaso.e1;

import java.util.Scanner;

public class Identidad {


public void identify(){
/*
Primero llamamos al scanner para poder pedir datos
Creamos las variables que corresponden a cada dato que necesitamos
Con los datos aparece el mensaje completo
 */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, indica tu nombre: ");
    String name = scanner.nextLine();

    System.out.println("Por favor, indica tu/s apellido/s: ");
    String lastName = scanner.nextLine();

    System.out.println("Por favor, indica tu edad: ");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("\n" + "Gracias por la información. Los datos proporcionados son los siguientes: "
            + "\n" + "Nombre: " + name + "\n" + "Apellidos: " + lastName + "\n" + "Edad: " +  age);

    }

}
