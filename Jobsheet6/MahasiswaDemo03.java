import java.util.Scanner;
public class MahasiswaDemo03{
    public static void main(String[] args){
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();
        Mahasiswa03 m1 = new Mahasiswa03("123", "Ali", "2B", 3.9);
        Mahasiswa03 m2 = new Mahasiswa03("124", "Ila", "2B", 3.1);
        Mahasiswa03 m3 = new Mahasiswa03("125", "Agus", "2B", 3.6);
        Mahasiswa03 m4 = new Mahasiswa03("126", "Tika", "2B", 3.3);
        Mahasiswa03 m5 = new Mahasiswa03("127", "Udin", "2B", 3.2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.SelectionSort();
        list.tampil();
    }
}