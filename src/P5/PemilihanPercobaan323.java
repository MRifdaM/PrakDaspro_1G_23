package P5;
import java.util.Scanner;
public class PemilihanPercobaan323 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan Angka pertama: ");
        angka1 = input23.nextDouble();
        System.out.print("Masukkan Angka kedua: ");
        angka2 = input23.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input23.next().charAt(0);
        input23.close();

        switch(operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2; 
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
        }
    }
    
}
