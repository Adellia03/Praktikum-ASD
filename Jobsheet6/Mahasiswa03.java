import java.util.Scanner;
public class Mahasiswa03{
    String nim;
    String nama;
    String kelas;
    Double ipk;

    Mahasiswa03(){
    }

    Mahasiswa03(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}