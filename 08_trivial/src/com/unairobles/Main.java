package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] preguuntas = {
                "¿Que día es hoy?",
                "¿De que color es el agua?",
                "¿Cuantas patas tiene un cerdo?"};
        String[] respuestas = {
                " Lunes",
                "Incolora",
                "Cuatro"
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();
        int correctas = 0;
        int incorrectas = 0;

        char respuesta;
        do {
            int aleatorio = r.nextInt(preguuntas.length);
            System.out.println("Pregunta: " + preguuntas[aleatorio]);
            br.readLine();
            System.out.println("La respuesta es: " + respuestas[aleatorio]);
            System.out.println();
            System.out.println("¿Te la sabias? ");
            respuesta = br.readLine().toLowerCase().charAt(0);
            if (respuesta == 's') {
                correctas++;
            } else {
                incorrectas++;}
                System.out.println("¿Quieres Continuar? (s/n): ");
                respuesta = br.readLine().toLowerCase().charAt(0);

        } while (respuesta != 'n');
    }
}
