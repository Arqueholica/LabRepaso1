package com.repaso.e1;

import java.util.Scanner;

public class ArrayALaCarte {
/*
Crear un array con creación scanner que determine el largo

Scanner que pregunte los personajes foreando hasta que se acabe el array

Mostrar en terminal (¿Separado?)
 */
Scanner scanner = new Scanner(System.in);

public void createArray(){
    System.out.println("¿Qué cantidad de nombres de GoT deseas?");
    int size = scanner.nextInt();
    scanner.nextLine();

    String[] gotNames = new String[size];

    for (int i = 0; i < gotNames.length ; i++) {
        System.out.println("Introduce el nombre de GoT: ");
        String name = scanner.nextLine();
        gotNames[i] = name;
    }
    for (int i = 0; i < gotNames.length ; i++) {
        System.out.println(gotNames[i]);
    }


}


}
