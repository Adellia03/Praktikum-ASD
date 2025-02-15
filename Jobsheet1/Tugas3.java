import java.util.Scanner;
public class Tugas3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("=== DAFTAR JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Semua Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang dicari: ");
                    String hariCari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hariCari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang dicari: ");
                    int semesterCari = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, semesterCari);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String namaCari = sc.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, namaCari);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-5.");
            }
        } while (pilihan != 5);
    }

    static void tampilkanSemuaJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("=== SELURUH JADWAL KULIAH ===");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String cariHari) {
        System.out.println("JADWAL HARI " + cariHari);
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(cariHari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal kuliah pada hari " + cariHari);
    }

    static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int cariSemester) {
        System.out.println("JADWAL SEMESTER " + cariSemester);
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == cariSemester) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada mata kuliah untuk semester " + cariSemester);
    }

    static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String cariNama) {
        System.out.println("PENCARIAN MATA KULIAH: " + cariNama);
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah " + cariNama + " tidak ditemukan.");
    }
}
