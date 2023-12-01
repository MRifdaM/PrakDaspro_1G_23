package P13;
import java.util.Scanner;

public class Percobaan623 {
    static int hitungLuas(int pjg, int lb){
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args){
        Scanner sc23 = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan Panjang : ");
        p = sc23.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = sc23.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc23.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
        sc23.close();
    }
}