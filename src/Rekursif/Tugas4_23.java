package Rekursif;

import java.util.Scanner;

public class Tugas4_23 {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Bulan ke: ");
        int n = sc23.nextInt();
        System.out.println("Jumlah Marmut: " + fibonacci(n));
        sc23.close();
    }
}