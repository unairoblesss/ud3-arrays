package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] tablero = new int[3][3];
        int turno = 0;
        int tiradas = 0;

        int tiradas = 0;
        do { System.out.println(" Escribe fila y columna: ");
            System.out.println(" FILA: ");
            int f = Integer.parseInt(br.readLine());
            System.out.println(" COLUMNA: ");
            int c = Integer.parseInt(br.readLine());
            if (tablero[f][c] == 3){tiradas
                visualizarTablero(tablero, turno);

                tiradas += 1;
        } while (tiradas <= 9 && !hayGanador(tablero));
//SUFICIENTE INFORMACION POR HOY!!!
        comprobarGanador(tablero);
//......................................................................................................................<----REVISAR -.-"
    }

    private static boolean hayGanador(int[][] tablero, int turno) {
        boolean hayGanador = false;
        if (tablero[0][0] == turno && tablero[0][1] == turno && tablero[0][2] == turno) {
            hayGanador = true;
        }
        if (tablero[1][0] == turno && tablero[1][1] == turno && tablero[1][2] == turno) {
            hayGanador = true;
        } if (tablero[2][0] == turno && tablero[2][1] == turno && tablero[2][2] == turno) {
            hayGanador = true;
        } if (tablero[0][0] == turno && tablero[1][1] == turno && tablero[2][2] == turno) {
            hayGanador = true;
        } if (tablero[0][1] == turno && tablero[0][1] == turno && tablero[0][2] == turno) {
            hayGanador = true;
        } if (tablero[0][2] == turno && tablero[0][1] == turno && tablero[0][2] == turno) {
            hayGanador = true;
        } if (tablero[0][0] == turno && tablero[0][1] == turno && tablero[0][2] == turno) {
            hayGanador = true;
        } if (tablero[0][0] == turno && tablero[0][1] == turno && tablero[0][2] == turno) {
            hayGanador = true;
        }
        return hayGanador;
    }

    private static void comprobarGanador(int[][] tablero, int i) throws IOException {

    }

    public static void visualizarTablero(int[][] tablero) throws IOException {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                switch (tablero[i][j]) {
                    case 0:
                        System.out.print(" . ");
                        break;
                    case 1:
                        System.out.print(" O ");
                        break;
                    case 2:
                        System.out.print(" X ");
                        break;
                }

            }
            System.out.println();
        }
    }
}
