import java.util.Scanner;
public class Tugas2{
    
    static int hitungVolume(int a) {
        int volume= a*a*a;
        return volume; 
    }
    static int hitungLuasPermukaan(int a) {
        int lp= 6*(a*a);
        return lp;
    }
    static int hitungKeliling(int a) {
        int keliling= 12 * a;
        return keliling; 
    }

    static void tampilkanMenu() {
        System.out.println("=======================================");
        System.out.println("        PROGRAM KALKULATOR KUBUS       ");
        System.out.println("=======================================");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan, s;

        do {
            tampilkanMenu();
            pilihan = sc.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang sisi kubus: ");
                s = sc.nextInt();
            } else {
                s = 0; 
            }

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(s));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(s));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(s));
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-4.");
            }
            System.out.println();
        } while (pilihan != 4);
    }
}