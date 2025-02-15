import java.util.Scanner;
public class Fungsi {
    static String[] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static int[][] stok = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };
    static int[] harga = {75000, 50000, 60000, 10000};
    
    public static void main(String[] args) {
        tampilkanPendapatan();
  
        tampilkanStok(3);
    
        kurangiStokMati(3);
        System.out.println("Stok setelah pengurangan bunga mati:");
        tampilkanStok(3);
    }
    
    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
        System.out.println();
    }
    
    public static void tampilkanStok(int cabang) {
        System.out.println("Stok bunga di RoyalGarden " + (cabang + 1) + ":");
        for (int i = 0; i < bunga.length; i++) {
            System.out.println(bunga[i] + ": " + stok[cabang][i]);
        }
        System.out.println();
    }
    
    public static void kurangiStokMati(int cabang) {
        int[] bungaMati = {1, 2, 0, 5}; 
        for (int i = 0; i < stok[cabang].length; i++) {
            stok[cabang][i] -= bungaMati[i];
            if (stok[cabang][i] < 0) stok[cabang][i] = 0; 
        }
    }
}
    