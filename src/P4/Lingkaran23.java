package P4;
import java.util.Scanner;

public class Lingkaran23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int r;
        double keliling, luas;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input23.nextInt();
        keliling = 2*3.14*r;
        luas = 3.14*r*r;
        input23.close();
        System.out.println(keliling);
        System.out.println(luas);
    }
}