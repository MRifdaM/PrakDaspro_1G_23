package P9;

import java.util.Scanner;
public class ArrayRataNilai23 {
    public static void main(String[] args) {
    Scanner sc23 = new Scanner(System.in);
    int[] nilaiMhs = new int[10];
    int jmlMahasiswa = 0;
    double total = 0;
    double rata2;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
        nilaiMhs[i] = sc23.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        if (nilaiMhs[i] > 70) {
            jmlMahasiswa++;
        }
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        total += nilaiMhs[i];
    }
    rata2 = total/nilaiMhs.length;
    System.out.println("Rata-rata nilai = "+rata2);
    System.out.println("Jumlah Mahasiswa yang lulus sebanyak " + jmlMahasiswa + " Mahasiswa");
    sc23.close();
    }
}
