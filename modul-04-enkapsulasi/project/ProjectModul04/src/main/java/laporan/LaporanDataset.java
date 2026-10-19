<<<<<<< HEAD
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
=======
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
>>>>>>> 38f099a74400d9897f4f17586fffb1addd26b384
