package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double min = 1000;
        double max = 0;

        double[] temperaturas;
        temperaturas = new double[24];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Escribela temperatura de cada hora: ");
            temperaturas[i] = Double.parseDouble(br.readLine());

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            } else if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}

