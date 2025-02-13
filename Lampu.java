
package lampu;
import java.util.Scanner;
public class Lampu {
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Warna: ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu Merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu Kuning, Harap Hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, Silakan Jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
    }
    
}
