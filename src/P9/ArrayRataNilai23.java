package P9;

import java.util.Scanner;
public class ArrayRataNilai23 {
    public static void main(String[] args) {
    Scanner sc23 = new Scanner(System.in);
    int n = 0, total = 0, total2 = 0, jmlLulus = 0, jmlTdkLulus = 0;
    double rata1 = 0.0, rata2 = 0.0;
    System.out.print("Masukkan jumlah Mahasiswa :");
    n = sc23.nextInt();
    int[] nilaiMhs = new int[n];

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
        nilaiMhs[i] = sc23.nextInt();
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
        if ( nilaiMhs[i] > 70) {
            total += nilaiMhs[i];
            jmlLulus++;
        } else {
            total2 += nilaiMhs[i];
            jmlTdkLulus++;
        }
    }
    rata1 = (double) total/jmlLulus;
    rata2 = (double) total2/jmlTdkLulus;
    System.out.println("Rata-rata nilai lulus = "+ rata1 );
    System.out.println("Rata-rata nilai tidak lulus = "+ rata2 );
    
    sc23.close();
    }
}
