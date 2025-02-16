package wsibd_minggu3;
import java.util.Scanner;
public class Wsibd_minggu3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Batas Awal: ");
        int batasawal = input.nextInt();
        
        System.out.print("Masukkan Batas Akhir: ");
        int batasakhir = input.nextInt();
        
        for (int i = batasawal; i <= batasakhir; i += 2) {
            System.out.print(i + " ");
        }
        
    }
    
}