package com.mycompany.matriks;

import java.util.Scanner;

public class Matriks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int MH[][] = new int[2][3];
        int MA[][] = new int[2][3];
        int MB[][] = new int[2][3];
        System.out.println("Program Matriks Ordo 2x3");
        System.out.println("Input Matriks A : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "," + j + "] = ");
                MA[i][j] = s.nextInt();
            }
        }
        System.out.println("Input Matriks B : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "," + j + "] = ");
                MB[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                MH[i][j] = MA[i][j] + MB[i][j];
            }
        }
        System.out.println("Hasil Penjumlahan Matriks");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(MH[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
