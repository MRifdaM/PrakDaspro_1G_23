package P5;
import java.util.Scanner;

public class PemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        
        System.out.print("Nilai uas      : ");
        float uas = input23.nextFloat();
        System.out.print("Nilai uts      : ");
        float uts = input23.nextFloat();
        System.out.print("Nilai kuis     : ");
        float kuis = input23.nextFloat();
        System.out.print("Nilai tugas    : ");
        float tugas = input23.nextFloat();
        input23.close();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
    }
}
