package P11;
import java.util.Scanner;
public class tugas1_23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        
        System.out.print("Masukkan nilai N: ");
        int n = sc23.nextInt();

        
        if (n < 3) {
            System.out.println("Masukkan nilai N lebih dari 2.");
        } else {
            
            for (int i = 1; i <= n; i++) {
                
                for (int k = n - i; k > 0; k--) {
                    System.out.print("  ");
                }
                
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        sc23.close();
    }
}

