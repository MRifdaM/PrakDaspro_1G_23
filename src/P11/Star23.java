package P11;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int n = 0;
        System.out.print("Masukkan nilai N : ");
        n = sc23.nextInt();
        for (long i = 1; i <= n; i--) {
            System.out.print("*");
        }
        sc23.close();
    }
}