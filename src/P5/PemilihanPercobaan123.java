package P5;
import java.util.Scanner;

public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int angka;
        System.out.println("Masukkan Angka:  ");
        angka = input23.nextInt();
        input23.close();
        String message = (angka % 2 == 0) ? " Bilangan Genap" : " Bilangan Ganjil";
        System.out.println("Angka " + angka + " adalah" + message);
        
    }
}