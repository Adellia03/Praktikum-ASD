import java.util.Scanner;
public class Matakuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah03() {
    }

    public Matakuliah03 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this. jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode        : ");
        this.kode = sc.nextLine();
        System.out.print("Nama        : ");
        this.nama = sc.nextLine();
        System.out.print("Sks         : ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah jam  : ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println ("-----------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Sks        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println ("-----------------------------------");
    }
}