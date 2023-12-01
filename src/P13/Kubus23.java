package P13;
import java.util.Scanner;

public class Kubus23 {
    public static void main(String[] args){
        Scanner sc23 = new Scanner(System.in);
        int s ;
        System.out.print("Masukkan sisi kubus : ");
        s = sc23.nextInt();
        int vol = hitungVolume(s);
        System.out.println("Volume kubus adalah : " + vol);
        sc23.close();
        int Luas = luasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah : " + Luas);
    }

    static int  hitungVolume(int a){
        int volume = a * a * a;
        return volume;
    }

    static int luasPermukaan(int a){
        int L = 6 * a * a;
        return L;
    }
}
