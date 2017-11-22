package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cuantos sois en clase?");
        int n = Integer.parseInt(br.readLine());
        String[] nombres;
        nombres = new String[n];
        for (int i = 0; i < n; i++){
        System.out.println("Escribe Nombre y Apellido de compañer@ de clase: ");
        nombres[i] = br.readLine();}
        "Introduce tu busqueda"
    }
}
