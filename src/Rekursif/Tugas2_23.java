package Rekursif;

import java.util.Scanner;

public class Tugas2_23 {
    static int jumlahKan(int n, int start) {
        System.out.print(start);
        if (start >= n)
            return start;
        System.out.print(" + ");
        return start + jumlahKan(n, start + 1);
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = sc23.nextInt();
        System.out.println(" = " + jumlahKan(n, 1));
        sc23.close();
    }
}