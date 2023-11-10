package P10;

import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int baris, kolom, pilih;
        String nama, next, pilih2;
        boolean menu = true;
        String penonton[][] = new String[4][2];

        while (menu) {
            System.out.println("MENU 1: INPUT DATA PENONTON");
            System.out.println("MENU 2:TAMPILKAN DAFTAR PENONTON");
            System.out.println("MENU 3: EXIT");
            System.out.print("Masukkan menu : ");
            pilih = sc23.nextInt();

            switch (pilih) {
                case 1:
                while(true) {
                    System.out.println("==INPUT DATA PENONTON==");
                    System.out.print("Masukkan nama: ");
                    nama = sc23.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc23.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc23.nextInt();
                    sc23.nextLine();
                    if(baris > penonton.length || kolom > penonton[0].length) {
                        System.out.println("Kursi tidak tersedia");
                    } else {
                    penonton[baris-1][kolom-1] = nama;
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc23.next();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                    break;
                case 2:
                    System.out.println("==TAMPILKAN DAFTAR PENONTON==");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
                    }
                    break;
                case 3:
                    System.out.println("==EXIT==");
                    System.out.print("Keluar (y/t) ?: ");
                    pilih2 = sc23.next();
                    if (pilih2.equalsIgnoreCase("y")) {
                        menu = false;
                    } else {
                        break;
                    }
                    break;
            }
        }
        sc23.close();
    }
}
