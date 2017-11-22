package com.unairobles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;

        double n = 0;
        double m = 0;

        double[] temperaturas;
        temperaturas = new double[24];

        for (int i = 0; i < temperaturas.length; i++) {

            do {
                System.out.print("Escribela temperatura de cada hora: ");
                temperaturas[i] = Double.parseDouble(br.readLine());
            } while (temperaturas[i] < 100 && temperaturas[i] > -100);

            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            n = n + temperaturas[i];

        }

        m = n / 24;
        System.out.println(max);
        System.out.println(min);
        System.out.println(m);

    }
}


