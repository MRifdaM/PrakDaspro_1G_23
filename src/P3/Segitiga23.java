package P3;

import java.util.Scanner;
public class Segitiga23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.println("Masukkan alas: ");
        alas = sc23.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc23.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}
