package P4;
import java.util.Scanner;

public class HargaBayar23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int harga, jumlah;
        double dis = 0.1, total, bayar, jmlDis;
        System.out.println("Masukkan harga barang ");
        harga = input23.nextInt();
        System.out.println("Masukkan jumlah barang ");
        jumlah = input23.nextInt();
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total- jmlDis;
        input23.close();
        System.out.println("Diskon anda adalah " + jmlDis);
        System.out.println("jumlah yang harus dibayar adalah " + bayar);

    }
}
