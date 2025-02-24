import java.util.Scanner;
public class MataKuliahMain03{
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03("ASD333", "Algoritma dan Struktur Data", 3, 6);
        mk1.tampilInformasi();

        MataKuliah03 mk2 = new MataKuliah03 ();
        mk2.kodeMK = "BD222";
        mk2.nama = "Basis Data";
        mk2.sks = 2;
        mk2.jumlahJam = 4;
        mk2.tampilInformasi();

        System.out.println("Mengubah SKS dan jumlah jam");
        mk2.ubahSKS(3);
        mk2.tambahJam(3);
        mk2.kurangiJam(1);
        mk2.tampilInformasi();
    }
}