package sc2;

import java.util.Scanner;

public class Sc2 {

    public static void main(String[] args) {
        double nilai[][] = {
            {111, 80, 70, 60, 90, 0}, {112, 90, 70, 60, 70, 0}, {113, 70, 90, 70, 80, 0}, {114, 80, 80, 90, 70, 0}, {115, 80, 80, 95, 70, 0},};
        System.out.println("Program Nilai Akhir");
        System.out.println("NPM\tTugas\tKuis\tUTS\tUAS");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println("");
        }
        double NA;
        for (int i = 0; i < 5; i++) {
            NA = 0;
            for (int j = 1; j < 5; j++) {
                if (j == 1 || j == 2) {
                    NA = NA + 0.2 * nilai[i][j];
                } else if (j == 3 || j == 4) {
                    NA = NA + 0.3 * nilai[i][j];
                }
            }
            nilai[i][5] = NA;
        }
        System.out.println("NPM\tTugas\tKuis\tUTS\tUAS\tNA");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
