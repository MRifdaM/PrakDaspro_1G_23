package P7;
import java.util.Scanner;

public class WhileKelipatan23 {
    public static void main(String[] args) {
        Scanner scan23 = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0, i = 1;
        double rataRata;
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan23.nextInt();
        scan23.close();
        while ( i <= 50 ) {
            if (i % kelipatan == 0) {
                jumlah+=i;
                counter++;
            }
            i++;
        }
        rataRata = jumlah/counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("rata-rata bilangan kelipatan %d adalah %s\n", kelipatan, rataRata);
    }
}
