package com.repaso.e1;


public class ArrayTwenty {
    int[] numeros = {50, 87, 65, 654, 45, 6, 14, 3, 8, 15, 74, 66, 22, 10, 3, 4751, 654, 546, 6587, 15,165};

    public void showArray(){

        for (int i = 0; i < numeros.length; i++) {
            if((numeros[i]) % 2 == 0){
                System.out.println("El número " + numeros[i] + " es par");
            } else {
                System.out.println("El número " + numeros[i] + " es impar");

            }

        }
    }



}
