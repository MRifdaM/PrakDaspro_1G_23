package P4;
import java.util.Scanner;

public class Gaji23 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukkan jumlah hari masuk anda ");
        jmlMasuk = input23.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk anda ");
        jmlTdkMasuk = input23.nextInt();
        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        input23.close();
        System.out.println("Gaji anda adalah " + totGaji);
    }
}
