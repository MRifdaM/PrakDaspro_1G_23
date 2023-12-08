package Rekursif;

import java.util.Scanner;

public class Tugas3_23 {
    static boolean cekPrima(int n, int m) {
        if (n <= 1) {
            return false;
        } else if (m == 1) {
            return true;
        } else if (n % m == 0) {
            return false;
        } else {
            return cekPrima(n, m - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan : ");
        bilangan = sc23.nextInt();
        boolean hasil = cekPrima(bilangan, bilangan / 2);
        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
        sc23.close();
    }
}
