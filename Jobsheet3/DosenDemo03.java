import java.util.Scanner;
public class DosenDemo03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();
        Dosen03[] arrayOfDosen = new Dosen03[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1) + ":");
            System.out.print("Kode               : ");
            String kode = sc.nextLine();
            System.out.print("Nama               : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelaminInput = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jenisKelaminInput == 'L');
            System.out.print("Usia               : ");
            int usia = sc.nextInt();
            sc.nextLine();
            arrayOfDosen[i] = new Dosen03 (kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilkanInfo();
        }
    }
}