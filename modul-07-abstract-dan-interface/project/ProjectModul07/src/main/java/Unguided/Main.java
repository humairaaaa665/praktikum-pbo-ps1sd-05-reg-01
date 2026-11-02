package Unguided;

public class Main {
    public static void main(String[] args) {
        // Uji proteksi abstraksi: kalau di-uncomment, error karena TiketBioskop abstract
        // TiketBioskop tiket = new TiketBioskop("Interstellar", 40000, 2);

        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        TiketReguler reguler = new TiketReguler("Interstellar", 40000, 2, 3);
        TiketVIP vip = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
        PaketSnack snack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

        // Array heterogen bertipe interface
        ItemTransaksi[] keranjang = {reguler, vip, snack};

        System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");
        double grandTotal = 0;
        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();
            grandTotal += item.getNominalBayar();
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("TOTAL TRANSAKSI : Rp" + grandTotal);
        System.out.println("=============================================================");

        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}