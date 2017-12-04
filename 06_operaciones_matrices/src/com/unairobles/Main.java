package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] matrizuno = new int[4][4];
        int[][] matrizdos = new int[4][4];
        Random r = new Random();
        for (int i = 0; i < matrizuno.length; i++) {
            for (int j = 0; j < matrizuno.length; j++) {
                matrizuno[i][j] = r.nextInt(100);
                matrizdos[i][j] = r.nextInt(100);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            char opcion;
            do {
                System.out.println(" OPERACIONES DISPONIBLES ");
                System.out.println(" a) Sumar matrices ");
                System.out.println(" b) Producto por un escalar ");
                System.out.println(" c) Producto");
                System.out.println(" d) Traspuesta ");
                System.out.println(" e) Salir ");
                System.out.println(" OPCION: ");
                opcion = br.readLine().charAt(0);
                switch (opcion) {
                    case 'a':
                        visualizar(sumamatrizes(matrizuno, matrizdos));
                        break;
                    case 'b':
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                }
            } while (opcion != 'e');
        }
    }

    public static int[][] sumamatrizes(int[][] matrizuno, int[][] matrizdos) {
        int[][] r = new int[4][4];

        return r;
    }

    public static int visualizar(int[][] matriz) throws IOException {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
        }
    }
}