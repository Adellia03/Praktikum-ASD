import java.util.Scanner;
public class MataKuliah03{
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah03() {
    }

    public MataKuliah03(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS              : " + sks);
        System.out.println("Jumlah Jam       : " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + this.sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan. Sekarang menjadi: " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam - jam >= 0) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Sekarang menjadi: " + this.jumlahJam);
        } else {
            System.out.println("Jumlah jam tidak bisa kurang dari 0!");
        }
    }
}