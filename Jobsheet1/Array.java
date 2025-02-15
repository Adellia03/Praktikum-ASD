import java.util.Scanner;
public class Array{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("================================");
    System.out.println("Program Menghitung IP Semester");
    System.out.println("================================");

    System.out.print("Masukkan jumlah mata kuliah: ");
    int jumlahMK = input.nextInt();
    input.nextLine(); 

    String[] mataKuliah = new String[jumlahMK];
    int[] sks = new int[jumlahMK];
    String[] nilaiHuruf = new String[jumlahMK];
    double[] nilaiAngka = new double[jumlahMK];
    double[] bobotNilai = new double[jumlahMK];

    for (int i = 0; i < jumlahMK; i++) {
        System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
        mataKuliah[i] = input.nextLine();
        
        System.out.print("Masukkan jumlah SKS untuk " + mataKuliah[i] + ": ");
        sks[i] = input.nextInt();
        input.nextLine(); 
        
        System.out.print("Masukkan nilai huruf untuk " + mataKuliah[i] + " (A, B+, B, C+, C, D, E): ");
        nilaiHuruf[i] = input.nextLine().toUpperCase();
        
        bobotNilai[i] = konversiBobot(nilaiHuruf[i]);
        nilaiAngka[i] = konversiNilaiAngka(nilaiHuruf[i]);
    }

    System.out.println("================================");
    System.out.println("Hasil Konversi Nilai");
    System.out.println("================================");
    System.out.println("MK | SKS | Nilai Angka | Nilai Huruf | Bobot Nilai");
    System.out.println("-------------------------------------------------------");

    double totalBobot = 0;
    double totalSKS = 0;

    for (int i = 0; i < jumlahMK; i++) {
        System.out.println(mataKuliah[i] + " | " + sks[i] + " | " + nilaiAngka[i] + " | " + nilaiHuruf[i] + " | " + bobotNilai[i]);
        totalBobot += bobotNilai[i] * sks[i];
        totalSKS += sks[i];
    }

    double ipSemester = totalBobot / totalSKS;

    System.out.println("================================");
    System.out.println("IP Semester: " + ipSemester);
    System.out.println("================================");
}

public static double konversiBobot(String huruf) {
    switch (huruf) {
        case "A": return 4.0;
        case "B+": return 3.5;
        case "B": return 3.0;
        case "C+": return 2.5;
        case "C": return 2.0;
        case "D": return 1.0;
        case "E": return 0.0;
        default: return 0.0;
    }
}

public static double konversiNilaiAngka(String huruf) {
    switch (huruf) {
        case "A": return 80;
        case "B+": return 73;
        case "B": return 70;
        case "C+": return 65;
        case "C": return 60;
        case "D": return 50;
        case "E": return 40;
        default: return 0;
    }
}
}