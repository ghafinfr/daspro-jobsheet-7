import java.util.Scanner;

public class KafeDoWhile12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);{

        // Deklarasi variabel harga
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int kopi, teh, roti;
        String namaPelanggan;
        int totalHarga;

        System.out.println("=== Program Kasir Kafe ===");

        // Perulangan DO-WHILE agar kasir bisa melayani banyak pelanggan
        do {
            System.out.print("\nMasukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            // Jika pelanggan mengetik "batal", hentikan transaksi
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Kasir berhenti melayani.");
                break;
            }

            // Input jumlah item yang dibeli
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            // Hitung total harga
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            // Bersihkan buffer agar tidak error di input berikutnya
            sc.nextLine();

        } while (true);

        System.out.println("\nSemua transaksi selesai.");
        sc.close();
    }
 }
}