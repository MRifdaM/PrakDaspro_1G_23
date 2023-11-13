package P11;

import java.util.Scanner;

public class Square23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        int n = 0;
        System.out.print("Masukkan nilai N : ");
        n = sc23.nextInt();
        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc23.close();
    }
}

