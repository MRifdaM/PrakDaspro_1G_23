package P10;

import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String penonton[][] = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc23.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc23.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc23.nextInt();
            sc23.nextLine();
            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya? (y/t): ");
            next = sc23.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
         }
         sc23.close();
    }
}
