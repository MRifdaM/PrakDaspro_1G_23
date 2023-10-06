package P5;
import java.util.Scanner;

public class PemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        String nilaiHuruf;
        
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

        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
        } else if (total > 73 && total <= 80){
            nilaiHuruf = "B+";
        } else if (total > 65 && total <= 73){
            nilaiHuruf = "B";
        } else if (total > 60 && total <= 65){
            nilaiHuruf = "C+";
        } else if (total > 50 && total <= 60){
            nilaiHuruf = "C";
        } else if (total > 39 && total <= 50){
            nilaiHuruf = "D";
        } else if (total <= 39){
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai Anda Tidak Terdaftar";
        }
        System.out.println("Nilai Akhir = " + total + " nilai anda adalah " + nilaiHuruf  + " sehingga " + message);
    }
}
