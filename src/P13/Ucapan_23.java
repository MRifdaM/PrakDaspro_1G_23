package P13;
import java.util.Scanner;

public class Ucapan_23 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you");
    }

    public static String PenerimaUcapan(){
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc23.nextLine();
        sc23.close();
        return namaOrang;
    }
}