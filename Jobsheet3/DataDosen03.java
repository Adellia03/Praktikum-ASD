import java.util.Scanner;
public class DataDosen03{

    public static void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Berdasarkan Jenis Kelamin:");
        System.out.println("Pria   : " + jumlahPria);
        System.out.println("Wanita : " + jumlahWanita);
        System.out.println("-----------------------------------");
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.jenisKelamin) {
                totalUsiaPria += dosen03.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen03.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Berdasarkan Jenis Kelamin:");
        if (jumlahPria > 0) {
            System.out.println("Pria   : " + (totalUsiaPria / jumlahPria));
        } else {
            System.out.println("Pria   : Tidak ada data");
        }

        if (jumlahWanita > 0) {
            System.out.println("Wanita : " + (totalUsiaWanita / jumlahWanita));
        } else {
            System.out.println("Wanita : Tidak ada data");
        }
        System.out.println("-----------------------------------");
    }

    public static void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen tidak tersedia.");
            return;
        }

        Dosen03 dosenTertua = arrayOfDosen[0];
        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.usia > dosenTertua.usia) {
                dosenTertua = dosen03;
            }
        }

        System.out.println("Dosen Paling Tua:");
        dosenTertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("Data dosen tidak tersedia.");
            return;
        }

        Dosen03 dosenTermuda = arrayOfDosen[0];
        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.usia < dosenTermuda.usia) {
                dosenTermuda = dosen03;
            }
        }

        System.out.println("Dosen Paling Muda:");
        dosenTermuda.tampilkanInfo();
    }
}