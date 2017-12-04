package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe texto: ");
        String texto = br.readLine();

        int[] letrasAlfabeto = new int[24];
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        contarletras(texto, letrasAlfabeto);
        visualizarResultado(letrasAlfabeto);

    }

    private static void visualizarResultado(int[] letrasalfabeto) {
        for (int i = 0; i < 26; i++) {
            System.out.println(letrasalfabeto[i]);
        }

    }

    private static void contarletras(String texto, int[] letrasAlfabeto, String[] letras) {
        int n = texto.length();
        for (int i = 0; i < n; i++) {
            char x = texto.charAt(i);
            for (i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) ==) {
                } letrasAlfabeto++;
            }
        }
    }
}//REVISARLO ENTERO MO ESTA CORREGIDO


