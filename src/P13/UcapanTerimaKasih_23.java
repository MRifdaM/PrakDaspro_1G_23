package P13;
import java.util.Scanner;

public class UcapanTerimaKasih_23 {
    public static String PenerimaUcapan(){
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc23.nextLine();
        sc23.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
        UcapanTambahan(nama);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }

    public static void UcapanTambahan(String a){
        System.out.println("Semoga " + a + " sehat selalu");
    }
}
