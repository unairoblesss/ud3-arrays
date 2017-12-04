package com.unairobles;


import java.io.IOException;
import java.util.Random;

public class Main {


    public static void main(String[] args) throws IOException {
        int[][] matriztresportres = new int[10][10];
        Random r = new Random();
        // Pedir los datos
        for (int i = 0; i <matriztresportres.length; i++){
            for (int j = 0; j <matriztresportres.length;j++){

                int aleatorio = r.nextInt(100);
                matriztresportres[i][j] = aleatorio;
            }
        }
        // Visualzar los datos
        for (int i = 0; i <matriztresportres.length; i++){
            for (int j = 0; j <matriztresportres.length;j++){
                System.out.format("%4d", matriztresportres[i][j]);
            }
            System.out.println();
        }

    }
}
