package perulangan_for;
public class perulangan_for_each {
    public static void main(String[] args) {
        //membuat array
        int angka[] = {3, 1, 42, 24, 12};
        
        //menggunakan perulangan for each untuk menampilkan angka
        for (int x : angka) {
            System.out.print(x + " ");
        }
    }
    
}