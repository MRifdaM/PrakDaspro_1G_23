package P4;
import java.util.Scanner;

public class Gaji23 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;
        System.out.println("Masukkan jumlah hari masuk anda ");
        jmlMasuk = input23.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk anda ");
        jmlTdkMasuk = input23.nextInt();
        System.out.println("Masukkan gaji anda ");
        gaji = input23.nextInt();
        System.out.println("Masukkan potongan gaji anda ");
        potGaji = input23.nextInt();
        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        input23.close();
        System.out.println("Gaji anda adalah " + totGaji);
    }
}
