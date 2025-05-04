import java.util.Scanner;
public class MahasiswaDemo03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi03 list = new MahasiswaBerprestasi03();

        System.out.println("Masukkan data 5 mahasiswa:");
        for (int i=0; i<5; i++){
            System.out.println("Mahasiswa ke-" + (i +1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("--------------------------------");
            sc.nextLine();

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("Data Mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sortiing berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}