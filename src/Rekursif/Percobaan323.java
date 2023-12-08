package Rekursif;

import java.util.Scanner;

public class Percobaan323 {
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0){
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int saldoAwal, tahun;
        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc23.nextInt();
        System.out.print("Lamannya investasi (tahun) : ");
        tahun = sc23.nextInt();
        System.out.println("Jumlah saldo awal " +  tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}