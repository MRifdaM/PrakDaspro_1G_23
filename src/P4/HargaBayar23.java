package P4;
import java.util.Scanner;

public class HargaBayar23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int harga, jmlBarang, jmlHalBuku;
        double dis, total, bayar, jmlDis;
        String merk;
        System.out.println("Masukkan harga barang ");
        harga = input23.nextInt();
        System.out.println("Masukkan jumlah barang ");
        jmlBarang = input23.nextInt();
        System.out.println("Masukkan merk buku");
        merk = input23.next();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHalBuku = input23.nextInt();
        System.out.println("Masukkan diskon");
        dis = input23.nextDouble();
        total = harga*jmlBarang;
        jmlDis = total*dis;
        bayar = total- jmlDis;
        input23.close();
        System.out.println("Merk buku: " + merk);
        System.out.println("jumlah halaman buku: " + jmlHalBuku);
        System.out.println("Diskon anda adalah " + jmlDis);
        System.out.println("jumlah yang harus dibayar adalah " + bayar);

    }
}
