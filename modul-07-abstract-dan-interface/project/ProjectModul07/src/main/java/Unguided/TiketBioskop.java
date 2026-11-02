package Unguided;

// Fondasi umum tiket, tidak boleh diinstansiasi langsung
public abstract class TiketBioskop implements ItemTransaksi {
    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    public TiketBioskop(String judulFilm, double hargaDasar, int jumlahKursi) {
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // Logika internal spesifik tiket, dirumuskan oleh subclass
    public abstract double hitungTotalBayar();

    @Override
    public abstract String getNamaTransaksi();

    // Kontrak publik kasir, cukup meneruskan ke hitungTotalBayar()
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}