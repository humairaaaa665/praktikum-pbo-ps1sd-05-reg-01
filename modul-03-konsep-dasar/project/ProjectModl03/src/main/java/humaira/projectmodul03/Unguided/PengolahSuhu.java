package humaira.projectmodul03.Unguided;

import java.util.Arrays;
import java.util.Locale;

public class PengolahSuhu {

    // Class field: aturan tetap milik class, dipakai bersama semua object
    private static final double NILAI_KOSONG = -1.0;

    // Instance field: berbeda untuk setiap object
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian; // menyimpan referensi array yang sama (tidak disalin)
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    public void isiDataKosong() {
        int i = cariIndexKosong();
        if (i != -1) {
            suhuHarian[i] = (suhuHarian[i - 1] + suhuHarian[i + 1]) / 2;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }

    public static void main(String[] args) {
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);
        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println("Index hari kosong (dimulai dari 0): " + pengolah.cariIndexKosong());
        System.out.println();

        pengolah.isiDataKosong();

        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();
        System.out.println(String.format(Locale.US, "Rata-rata : %.2f°C", pengolah.hitungRataRata()));
        System.out.println();

        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");

        /*
         * PENJELASAN:
         * Array di Java bertipe reference. Variabel suhuHarian di main hanya
         * menyimpan alamat memori tempat array berada, bukan isi array itu sendiri.
         * Saat new PengolahSuhu(suhuHarian) dipanggil, yang diteruskan ke
         * constructor adalah alamat tersebut, lalu constructor menyimpannya apa
         * adanya ke field this.suhuHarian tanpa membuat salinan. Akibatnya,
         * variabel di main dan field di dalam object menunjuk ke satu array yang
         * sama di memori. Ketika isiDataKosong() mengubah suhuHarian[i] lewat
         * object, perubahan itu terjadi pada array yang sama, sehingga langsung
         * terlihat juga dari variabel suhuHarian di main. Agar array di main tidak
         * ikut berubah, constructor harus menyalin array, misalnya dengan
         * this.suhuHarian = suhuHarian.clone();
         */
    }
}