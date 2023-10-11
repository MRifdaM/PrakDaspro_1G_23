package P6;
import java.util.Scanner;

public class Pemilihan2Percobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner (System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        System.out.print("Masukkan sudut pertama : ");
        sudut1=input23.nextFloat();
        System.out.print("Masukkan sudut kedua   : ");
        sudut2=input23.nextFloat();
        System.out.print("Masukkan sudut ketiga  : ");
        sudut3=input23.nextFloat();
        input23.close();

        totalSudut= sudut1 + sudut2 + sudut3;
        if (totalSudut == 180){
            if (sudut1==90 || sudut2==90 || sudut3==90) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            } else if (sudut1==60 && sudut2==60 && sudut3==60) {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Sisi");
            } else if ((sudut1==70 && sudut2==70 && sudut3==40) || (sudut1==40 && sudut2==70 && sudut3==70) || (sudut1==70 && sudut2==40 && sudut3==70)){
                System.out.println("Segitiga Tersebut Adalah Segitiga Sama Kaki");
            } else {
                System.out.println("Segitiga Tersebut Adalah Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}