package P8;
import java.util.Scanner;

public class menghitungGajiPegawaiTokoSepeda23 {
    public static void main(String[] args) {
        Scanner Rifda = new Scanner(System.in);
        System.out.println("=== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1G ===");
        System.out.println("DIBUAT OLEH : Muhammad Rifda Musyaffa'");
        System.out.println("NIM : 2341720028");
        System.out.println("==============================================");

        int menu23, noHp23, jmlPenjualanSepeda23 = 0, masaKeja23 = 0, jmlCuti23 = 0;
        String nama23 = " ", alamat23, pilih23, pilih223;
        Boolean isBreak23 = true, dataKaryawan = false;
        double komisi23 = 0.0, tunjangan23 = 0.0, gaji23=0.0;

        while (isBreak23) {
            System.out.println("========================");
            System.out.println("Pilih Menu :");
            System.out.println("1. Data Karyawan");
            System.out.println("2. Gaji Kryawan");
            System.out.println("========================");
            System.out.print("menu :");
            menu23 = Rifda.nextInt();


            switch (menu23) {
                case 1:
                System.out.println("======== Menu 1 =======");
                System.out.println("Masukkan Data Kryawan");
                System.out.print("Nama :");
                nama23 = Rifda.next();
                System.out.print("Alamat :");
                alamat23 = Rifda.next();
                System.out.print("No HP :");
                noHp23 = Rifda.nextInt();
                System.out.print("Jumlah Penjualan Sepeda :");
                jmlPenjualanSepeda23 = Rifda.nextInt();
                System.out.print("Masa Kerja :");
                masaKeja23 = Rifda.nextInt();
                System.out.print("Jumlah Cuti :");
                jmlCuti23 = Rifda.nextInt();
                dataKaryawan = true;

                System.out.println("Apakah anda ingin mencetak data karyawan? (y/t) :");
                pilih23 = Rifda.next();
                if (pilih23.equals("y") ) {
                System.out.println("=====================================");
                System.out.println("DATA KARYAWAN");
                System.out.println("=====================================");
                System.out.println("Nama :" + nama23);
                System.out.println( "Alamat :" + alamat23);
                System.out.println("No HP :" + noHp23);
                System.out.println("Jumlah Penjualan Sepeda :" + jmlPenjualanSepeda23);
                System.out.println("Masa Kerja :" + masaKeja23);
                System.out.println("Lama Cuti :" + jmlCuti23);
                System.out.print("Kembali ke menu? (y/t) :");
                pilih223 = Rifda.next();
                if (pilih223.equals("y")) {
                    break;
                }
                } else {
                    break;
                }
                break;

                case 2:
                if (!dataKaryawan) {
                    System.out.println("Masukkan data karyawan terlebih dahulu");
                    System.out.println("Kembali ke menu? (y/t) :");
                    pilih223 = Rifda.next();
                } else {
                    jmlPenjualanSepeda23 *= 1500000;
                    if (jmlPenjualanSepeda23 == 3000000){
                        komisi23 = jmlPenjualanSepeda23 * 0.02;
                    } else if (jmlPenjualanSepeda23 >= 3000000 && jmlPenjualanSepeda23 <= 5000000) {
                        komisi23 = jmlPenjualanSepeda23 * 0.05;
                    } else if (jmlPenjualanSepeda23 >= 5000000 && jmlPenjualanSepeda23 <= 10000000) {
                        komisi23 = jmlPenjualanSepeda23 * 0.07;
                    } else if (jmlPenjualanSepeda23 > 10000000) {
                        komisi23 = 0.15;
                    }
                    if (masaKeja23 < 3) {
                        System.out.println("Tidak ada tunjangan masa kerja");
                    } else if (masaKeja23 >= 3 && masaKeja23 <=5) {
                        tunjangan23 = 1000000;
                    } else if ( masaKeja23 >= 6 && masaKeja23 <= 8) {
                        tunjangan23 = 2000000;
                    } else if (masaKeja23 > 8) {
                        tunjangan23 = 3000000;
                    }
                    double potCuti23 = jmlCuti23 * 35000;
                    gaji23 = komisi23 + tunjangan23 - potCuti23;
                System.out.println("=====================================");
                System.out.println("GAJI KARYAWAN");
                System.out.println("=====================================");
                System.out.println("Nama :" + nama23);
                System.out.println( "Komisi penjualan:" + komisi23);
                System.out.println("Tunjagan :" + tunjangan23);
                System.out.println("Potongan Cuti :" + potCuti23);
                System.out.println("Gaji yang diterima :" + gaji23);
                System.out.println("Kembali ke menu? (y/t)");
                pilih223 = Rifda.next();
                }
            }
        }
        Rifda.close();
    }
}
