import java.util.Scanner;
public class DosenMain03 {
    public static void main(String[] args) {

        Dosen03 ds1 = new Dosen03("D001", "Vivi Nur Wijaya Ningrum, S.Kom., M.Kom.", true, 2010, "Pemrograman");
        Dosen03 ds2 = new Dosen03("D002", "Yan Watequlis Syaifudin, S.T., M.MT., Ph.D.", false, 2005, "Basis Data");

        System.out.println("Informasi Dosen Sebelum Perubahan:");
        ds1.tampilInformasi();
        ds2.tampilInformasi();

        ds1.setStatusAktif(false);

        ds2.ubahKeahlian("Keamanan Siber");

        int tahunSekarang = 2025;
        System.out.println("Masa Kerja " + ds1.hitungMasaKerja(tahunSekarang) + " tahun untuk " + ds1.nama);
        System.out.println("Masa Kerja " + ds2.hitungMasaKerja(tahunSekarang) + " tahun untuk " + ds2.nama);

        System.out.println("Informasi Dosen Setelah Perubahan:");
        ds1.tampilInformasi();
        ds2.tampilInformasi();
    }
}