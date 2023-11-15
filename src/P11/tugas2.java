package P11;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        
        System.out.print("Masukkan nilai N: ");
        int n = sc23.nextInt();

        
        if (n < 3) {
            System.out.println("Masukkan nilai N lebih dari 2");
        } else {
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print(n);
                    } else {
                        System.out.print(" ");
                    }

                    if (j < n) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        sc23.close();
    }
}

