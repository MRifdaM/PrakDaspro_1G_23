package Rekursif;
import java.util.Scanner;

public class Percobaan223 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static void cetakDeretPangkat(int x, int y) {
        System.out.print("Deret perhitungan pangkat: ");
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print("x");
            }
        }
        System.out.print(" = " + hitungPangkat(x, y));
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc23.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc23.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));

        cetakDeretPangkat(bilangan, pangkat);
    }
}
