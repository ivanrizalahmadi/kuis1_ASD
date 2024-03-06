import java.util.ArrayList;
import java.util.Scanner;

public class MainBarang13 {
    public static void main(String[] args) {
        TransaksiBarang transaksiBarang = new TransaksiBarang();

        // Inisialisasi data barang
        Barang barang1 = new Barang("K01", "Sabun", 1000, 5);
        Barang barang2 = new Barang("K02", "Pasta Gigi", 2000, 10);
        Barang barang3 = new Barang("K03", "Biore", 3000, 23);
        Barang barang4 = new Barang("K04", "Shampoo", 4000, 55);
        Barang barang5 = new Barang("K05", "Sikat Gigi", 5000, 65);

        // Menambahkan data barang ke transaksi
        transaksiBarang.tambahBarang(barang1);
        transaksiBarang.tambahBarang(barang2);
        transaksiBarang.tambahBarang(barang3);
        transaksiBarang.tambahBarang(barang4);
        transaksiBarang.tambahBarang(barang5);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== TOKO MAJU MUNDUR CANTIK =====");
            System.out.println("1. Tampilkan  Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan Pembelian");
            System.out.println("4. Keluar");

            System.out.print("Pilih (1-4): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    transaksiBarang.tampilkanBarang();
                    break;
                case "2":
                    System.out.print("Masukkan kode barang yang ingin dibeli: ");
                    String kodeBarang = scanner.nextLine();

                    // Proses pembelian barang

                    boolean lanjutBelanja = true;

                    while (lanjutBelanja) {
                        System.out.println("Apakah akan belanja kembali? (Y/N): ");
                        String userChoice = scanner.nextLine();

                        if (userChoice.equalsIgnoreCase("Y")) {

                            System.out.print("Masukkan kode barang yang ingin dibeli: ");
                            kodeBarang = scanner.nextLine();
                        } else if (userChoice.equalsIgnoreCase("N")) {

                            lanjutBelanja = false;
                        } else {
                            System.out.println(
                                    "Pilihan tidak valid. Silakan masukkan Y untuk lanjut atau N untuk kembali ke menu awal.");
                        }
                    }
                    break;

                case "3":

                    transaksiBarang.tampilkanBarangPembelian();
                    break;
                case "4":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
