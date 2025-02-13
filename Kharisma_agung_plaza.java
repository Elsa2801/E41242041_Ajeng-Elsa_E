package kharisma_agung_plaza;
import java.util.Scanner;
public class Kharisma_agung_plaza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------");
        System.out.println("          Kharisma Agung Plaza ( KAP )            ");
        System.out.println("            Promo Belanja Berhadiah               ");
        System.out.println("       Khusus Pembelian 5 Barang Pertama          ");
        System.out.println("        dengan Harga Minimum Rp. 10.000,00        ");
        System.out.println("--------------------------------------------------");
        
        System.out.print("Masukkan Nama Pembeli : ");
        String name = input.nextLine();
        
        int totalharga = 0;
        int[] hargabarang = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            hargabarang[i] = input.nextInt();
            totalharga += hargabarang[i];
        }

        System.out.println("Total harga pembelian atas nama " + name + " adalah Rp. " + totalharga);
        
        if (totalharga >= 10000) {
            System.out.println("\nSelamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("                 Terima Kasih                     ");
        System.out.println("   Anda sudah belanja di Kharisma Agung Plaza     ");
        
    }
    
}
