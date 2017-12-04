package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] matriztresportres = new int[3][3];

    // Pedir los datos
	System.out.println("Escribe valores para la matriz: ");
	for (int i = 0; i <3; i++){
	    for (int j = 0; j < 3;j++){
	        matriztresportres[i][j] = Integer.parseInt(br.readLine());
	    }
    }


    // Visualzar los datos
        for (int i = 0; i <3; i++){
            for (int j = 0; j < 3;j++){
                System.out.format("%4d", matriztresportres[i][j]);
            }
            System.out.println();
        }

    }
}
