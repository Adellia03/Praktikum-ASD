import java.util.Scanner;
public class praktikumpemilihan{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();

        System.out.println("=============================");
        System.out.println("=============================");
        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String nilaiHuruf;
            String keterangan;
            
            if (nilaiAkhir >= 80) nilaiHuruf = "A";
            else if (nilaiAkhir >= 73) nilaiHuruf = "B+";
            else if (nilaiAkhir >= 70) nilaiHuruf = "B";
            else if (nilaiAkhir >= 65) nilaiHuruf = "C+";
            else if (nilaiAkhir >= 60) nilaiHuruf = "C";
            else if (nilaiAkhir >= 50) nilaiHuruf = "D";
            else nilaiHuruf = "E";
            
            keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println("" + keterangan);
        }
    }
}