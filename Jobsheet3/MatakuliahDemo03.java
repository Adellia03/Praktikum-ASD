import java.util.Scanner;
public class MatakuliahDemo03{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatakuliah = sc.nextInt();
        Matakuliah03 [] arrayOfMatakuliah = new Matakuliah03[jumlahMatakuliah];

        for (int i=0; i < 3; i++) {
            System.out.println ("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah03();
            arrayOfMatakuliah[i].tambahData();
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
        
    }
}