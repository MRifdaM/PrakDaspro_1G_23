package P9;
import java.util.Scanner;

public class TugasP9 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int n = 0, total = 0;
        double rata2 = 0.0;

        System.out.print("Masukkan jumlah element :");
        n = sc23.nextInt();
        int[] arrayInt = new int[n];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan element ke-" + i + " :");
            arrayInt[i]= sc23.nextInt();
        }
        int max = arrayInt[0];
        int min = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            } else if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }
        for (int i = 0; i < arrayInt.length; i++) {
           total += arrayInt[i];
        }
        rata2 = (double) total/arrayInt.length;
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);
         System.out.println("Nilai rata rata : " + rata2);
        sc23.close();
    }
}