package laporan;

import model.Dataset;

public class LaporanDataset {

    public void cetak(Dataset d) {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + d.getNama());
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        System.out.printf("Missing      : %d sel (%.2f%%)%n",
                d.getJumlahMissing(), d.getPersentaseMissing());
        System.out.println("Status       : "
                + (d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih"));
        System.out.println();
    }
}
