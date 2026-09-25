public class RekapNilai {
    public static void main(String[] args) {

        // Konstanta KKM (Kriteria Ketuntasan Minimal)
        final double KKM = 75.0;

        // Array 1 Dimensi -> menyimpan nama mahasiswa (tipe data String)
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // Array 2 Dimensi (Rectangular) -> menyimpan nilai 2 modul tiap mahasiswa (tipe data double)
        // Baris = mahasiswa, Kolom = modul (Modul 1 dan Modul 2)
        double[][] nilaiModul = {
            {80.0, 70.0},   // nilai Andi
            {65.0, 60.0},   // nilai Budi
            {90.0, 85.0}    // nilai Citra
        };

        System.out.println("=========================================");
        System.out.println("       SISTEM REKAP NILAI MAHASISWA");
        System.out.println("=========================================");
        System.out.printf("KKM yang ditetapkan: %.1f%n", KKM);
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
                "Nama", "Modul 1", "Modul 2", "Rata-rata", "Status");
        System.out.println("-----------------------------------------");

        // Perulangan for untuk mengakses array dan menghitung rata-rata
        for (int i = 0; i < namaMahasiswa.length; i++) {

            double nilai1 = nilaiModul[i][0];
            double nilai2 = nilaiModul[i][1];
            double rataRata = (nilai1 + nilai2) / 2;

            // Percabangan untuk menentukan status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.printf("%-10s %-10.1f %-10.1f %-10.1f %-10s%n",
                    namaMahasiswa[i], nilai1, nilai2, rataRata, status);
        }

        System.out.println("=========================================");
    }
}