package Unguided;

public class ModelRegresi extends ModelML {
    // Turunan pertama: model regresi
    private int jumlahFitur;

    public ModelRegresi(String nama, int jumlahDataLatih, int jumlahFitur) {
        super(nama, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah fitur: " + jumlahFitur);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    // Overloading baru: dua parameter (epoch dan batch)
    public int hitungBiaya(int epoch, int batch) {
        return getJumlahDataLatih() * epoch / batch;
    }
}
