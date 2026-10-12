package main;

import model.Dataset;
import laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1: constructor tanpa parameter, lalu isi dengan setter
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        // Objek 2: constructor 1 parameter
        Dataset d2 = new Dataset("Wine Quality");

        // Objek 3: constructor lengkap
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        // Simpan dalam array
        Dataset[] daftar = {d1, d2, d3};

        // Cetak laporan dengan perulangan
        LaporanDataset laporan = new LaporanDataset();
        for (Dataset d : daftar) {
            laporan.cetak(d);
        }

        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
