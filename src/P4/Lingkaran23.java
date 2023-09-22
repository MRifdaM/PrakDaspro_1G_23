package P4;
import java.util.Scanner;

public class Lingkaran23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int r;
        double keliling, luas, phi;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input23.nextInt();
        phi = 3.14;
        keliling = 2*phi*r;
        luas = phi*r*r;
        input23.close();
        System.out.println(keliling);
        System.out.println(luas);
    }
}