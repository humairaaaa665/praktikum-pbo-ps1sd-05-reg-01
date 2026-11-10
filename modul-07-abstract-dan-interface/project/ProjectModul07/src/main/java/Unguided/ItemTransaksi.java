package Unguided;

// Kontrak publik kasir: semua barang yang bisa dibayar wajib memenuhi ini
public interface ItemTransaksi {
    double getNominalBayar();
    String getNamaTransaksi();
 
    // Default method: cetak satu baris struk
    default void cetakRincianItem() {
        System.out.println("- " + getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }
 
    // Static method: fungsi utilitas log
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}