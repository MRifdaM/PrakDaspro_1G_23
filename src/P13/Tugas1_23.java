package P13;

import java.util.Scanner;

public class Tugas1_23 {
    
    public static void main(String[] args) {
            int[][] nilaiMahasiswa = new int[5][7];
            String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
            inputData(namaMahasiswa, nilaiMahasiswa);
            tampilkanNilai(namaMahasiswa, nilaiMahasiswa);
            int NilaiMTertinggi = mingguTertinggi(nilaiMahasiswa);
            System.out.println("Minggu dengan nilai tertinggi adalah minggu ke-" + NilaiMTertinggi);
            printTertinggi(namaMahasiswa, nilaiMahasiswa);
    }

    public static int[][] inputData(String nama[], int dataNilai[][]) {
        Scanner sc23 = new Scanner(System.in);
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < dataNilai[i].length; j++) {
                System.out.print("Masukkan nilai Mahasiswa " + nama[i] + " pada minggu ke-"+ (j+1)+ " : " );
                dataNilai[i][j] = sc23.nextInt();
            }
        }
        sc23.close();
        return dataNilai;
    }

    public static void tampilkanNilai(String nama[], int dataNilai[][]) {
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < dataNilai[i].length; j++) {
                System.out.println("Nilai " + nama[i] + " pada minggu ke-" + (j + 1) + " : " + dataNilai[i][j]);
            }
        }
    }

    public static int mingguTertinggi(int[][] dataNilai) {
        int[] tambahTiapMinggu = new int[dataNilai[0].length];
        for (int i = 0; i < dataNilai[0].length; i++) {
            for (int j = 0; j < dataNilai.length; j++) {
                tambahTiapMinggu[i] += dataNilai[j][i];
            }
        }
        int tertinggi = tambahTiapMinggu[0];
        int minggu = 1;
        for (int i = 1; i < tambahTiapMinggu.length; i++) {
            if (tertinggi < tambahTiapMinggu[i]) {
                tertinggi = tambahTiapMinggu[i];
                minggu = i + 1;
            }
        }
        return minggu;
    }

    public static void printTertinggi(String[] nama, int[][] nilaiData) {
        int tertinggi = 0, k = 0;
        for (int i = 1; i < nilaiData.length; i++) {
            for (int j = 0; j < nilaiData[i].length; j++) {
                if (tertinggi < nilaiData[i][j]) {
                    tertinggi = nilaiData[i][j];
                    k = i;
                }
            }
        }
        System.out.println("Mahasiswa " + nama[k] + " memiliki nilai tertinggi yaitu "
                + tertinggi + " pada minggu ke-"
                + mingguTertinggi(nilaiData));
    }
}
