import java.util.Scanner;
public class MahasiswaDemo03{
    public static void main(String[] args){
        Mahasiswa03 [] arrayOfMahasiswa = new Mahasiswa03 [3];
        arrayOfMahasiswa[0] = new Mahasiswa03 ();
        arrayOfMahasiswa[0].nim = "244107020222";
        arrayOfMahasiswa[0].nama = "ADELLIA SALSA AL BARRA";
        arrayOfMahasiswa[0].kelas = "TI-1B";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa03 ();
        arrayOfMahasiswa[1].nim = "244123456777";
        arrayOfMahasiswa[1].nama = "SITI MUTMAINAH";
        arrayOfMahasiswa[1].kelas = "TI-1B";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa03 ();
        arrayOfMahasiswa[2].nim = "244643876533";
        arrayOfMahasiswa[2].nama = "SITI NIKMATUS SHOLIHAH";
        arrayOfMahasiswa[2].kelas = "TI-1B";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("-----------------------------------");
    }
}