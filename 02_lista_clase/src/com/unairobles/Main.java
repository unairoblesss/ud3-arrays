package com.unairobles;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numAlumnos = 20;
        String[] nombres;
        nombres = new String[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Escribe Nombre y Apellido de compañer@ de clase: ");
            nombres[i] = br.readLine();
        }

        System.out.println("Introduce tu busqueda");
        char m = br.readLine().charAt(0);
        do {
            for (int i = 0; i < numAlumnos; i++) {
                if (nombres[i].charAt(0) == m) {
                    System.out.println(nombres[i]);
                }

            }
        } while (m("FIN") = false)//NI IDEA//
    }
}
