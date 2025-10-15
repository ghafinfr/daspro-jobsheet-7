import java.util.Scanner;

public class SiakadFor12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {

         double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        // Input nilai 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Menentukan nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            // Menghitung jumlah lulus / tidak lulus
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa lulus      : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);

        sc.close();
    }
}
}
