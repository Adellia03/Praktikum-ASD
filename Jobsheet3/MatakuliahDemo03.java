import java.util.Scanner;
public class MatakuliahDemo03{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Matakuliah03 [] arrayOfMatakuliah = new Matakuliah03[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < 3; i++) {
            System.out.println ("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print ("Kode     : ");
            kode = sc.nextLine();
            System.out.print ("Nama     : ");
            nama = sc.nextLine();
            System.out.print ("Sks      : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt (dummy);
            System.out.print ("Jumlah jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println ("-----------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah03 (kode, nama, sks, jumlahJam);
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println ("-----------------------------------");
        }
        
    }
}