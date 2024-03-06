import java.util.ArrayList;
import java.util.Scanner;

class TransaksiBarang {
    ArrayList<Barang> barangs = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        barangs.add(barang);
    }

    public void tampilkanBarang() {
        System.out.println("Daftar Barang:");
        for (Barang barang : barangs) {
            System.out.println(
                    barang.kode + " - " + barang.nama + " (Harga: " + barang.harga + ", Stok: " + barang.stok + ")");
        }
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Barang yang dibeli:");
        for (Barang barang : barangs) {
            System.out.println(barang.kode + " - " + barang.nama);
        }
    }

    public boolean melakukanPembelian(String kodeBarang) {
        for (Barang barang : barangs) {
            if (barang.kode.equals(kodeBarang)) {
                if (barang.stok > 0) {
                    barang.stok -= 1;
                    return true;
                } else {
                    System.out.println("Stok barang habis.");
                    return false;
                }
            }
        }
        System.out.println("Kode barang tidak ditemukan.");
        return false;
    }
}