package com.repaso.e2;

import java.util.Scanner;

public class Saludo {
    Scanner scanner = new Scanner(System.in);


    public void saludo1(){
        System.out.println("Introduce un saludo: ");
        String saludo = scanner.nextLine();

        System.out.println("Introduce tu nombre: ");
        String name = scanner.nextLine();

        System.out.println(saludo + " " + name);
    }

    public void saludo2(String saludo, String name){
        System.out.println(saludo + " " + name);
    }

    public static String saludo3(String saludo, String name){
        return saludo + " " + name;
    }

}
