import java.util.Scanner;
public class MataKuliahMain03{
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03("ASD333", "Algoritma dan Struktur Data", 3, 6);
        mk1.tampilInformasi();

        MataKuliah03 mk2 = new MataKuliah03 ();
        mk2.kodeMK = "BD222";
        mk2.nama = "Basis Data";
        mk2.sks = 3;
        mk2.jumlahJam = 6;

        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(4);
        mk2.kurangiJam(2);
    
    MataKuliah03 mk3 = new MataKuliah03("AG222", "Agama", 2, 4);
    mk2.tampilInformasi();
    mk3.tampilInformasi();
    }
}