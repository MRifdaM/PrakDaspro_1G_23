package P6;
import java.util.Scanner;

public class namaWarna23 {
    public static void main(String[] args) {
        int nim;
        Scanner Rifda = new Scanner (System.in);
        System.out.println("Masukkan NIM Anda :");
        nim = Rifda.nextInt();
        int n = nim % 10;
        if (n < 3) {
            n += 5;
        }
        int warna = 0;
        while (warna < n) {
            if ( warna % 3 == 0) {
                System.out.println("merah");
            } else if (warna % 3 == 1) {
                System.out.println("kuning");
            } else {
                System.out.println("hijau");
            }
            warna++;
        }
        Rifda.close();
    }
}
