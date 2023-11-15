package P11;
import java.util.Scanner;

public class tugas3 {


    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        String cabor[] = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String namaAtlet[][] = new String[cabor.length][5];
        
        for (int i = 0; i < namaAtlet.length; i++) {
            System.out.println("Masukkan nama atlet untuk " + cabor[i]);
            for (int j = 0; j < namaAtlet[i].length; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                namaAtlet[i][j] = sc23.nextLine();
            }
            System.out.println();
        }
        for (int i = 0; i < namaAtlet.length; i++) {
            for (int j = 0; j < namaAtlet[i].length - 1; j++) {
                for (int k = j + 1; k < namaAtlet[i].length; k++) {
                    if (namaAtlet[i][j].compareTo(namaAtlet[i][k]) > 0) {
                        String swap = namaAtlet[i][j];
                        namaAtlet[i][j] = namaAtlet[i][k];
                        namaAtlet[i][k] = swap;
                    }
                }
            }
        }
        System.out.println("Nama-Nama Atlet:");

        for (int i = 0; i < namaAtlet.length; i++) {
            System.out.println("Cabang Olahraga: " + cabor[i]);
            for (int j = 0; j < namaAtlet[i].length; j++) {
                System.out.println("Atlet " + (j + 1) + ": " + namaAtlet[i][j]);
            }
            System.out.println();
        }
        sc23.close();
    }
}

