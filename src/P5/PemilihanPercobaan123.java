package P5;
import java.util.Scanner;

public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Angka:  ");
        angka = input23.nextInt();
        input23.close();
        
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah bilangan genap");
        } else {
            System.out.print("Angka "+angka+" adalah bilangan ganjil");
        }
    }
}