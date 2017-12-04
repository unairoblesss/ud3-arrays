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
        }

        visualizar(matrizuno);
        visualizar(matrizdos);

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
                    System.out.println("Escribe el escalar: ");
                    int escalar = Integer.parseInt(br.readLine());
                    visualizar(productoescalar(matrizuno, escalar));
                    break;
                case 'd':
                    visualizar(traspuesta(matrizuno));
                    break;
                case 'c':
                    visualizar(producto(matrizuno, matrizdos));
                    break;
                default:
                    System.out.println(" ESCRIBE UNA OPCION VALIDA: ");
            }
        } while (opcion != 'e');

    }

    public static int[][] productoescalar(int[][] matrizuno, int escalar) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matrizuno[i][j] * escalar;
            }
        }
        return matriz;
    }

    public static int[][] sumamatrizes(int[][] matrizuno, int[][] matrizdos) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matrizuno[i][j] + matrizdos[i][j];
            }
        }
        return matriz;
    }

    public static int[][] traspuesta(int[][] matrizuno) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = matrizuno[i][j];
            }
        }
        return matriz;
    }

    public static int[][] producto(int[][] matrizuno, int[][] matrizdos) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[j][i] = matrizuno[i][j] * matrizdos[i][j];
            }
        }
        return matriz;
    }

    public static void visualizar(int[][] matriz) throws IOException {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}