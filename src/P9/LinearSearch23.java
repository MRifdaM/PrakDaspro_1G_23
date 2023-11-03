package P9;
import java.util.Scanner;

public class LinearSearch23 {
    public static void main(String[] args) {
       Scanner sc23 = new Scanner(System.in);
       int n = 0, key = 0, hasil = 0;
       System.out.print("Masukkan jumlah elemen array :");
       n = sc23.nextInt();
       int[] arrayInt = new int[n];

       for (int i = 0; i < arrayInt.length; i++) {
        System.out.print("Masukkan elemen array ke-"+i+ " :");
        arrayInt[i] = sc23.nextInt();
       }
       System.out.println("Masukkan key yang ingin dicari: ");
       key = sc23.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil= i;
                break;
            }
        }
        System.out.println("Key ada di posisi indeks ke-"+hasil);
        sc23.close();
    }
}
