package Unguided;
public class ItemPesanan {
    private String namaItem;
    private RincianHarga rincian; // KOMPOSISI

    public ItemPesanan(String namaItem, double hargaDasar) {
        this.namaItem = namaItem;
        // RincianHarga dibuat di dalam constructor, bukan di main
        this.rincian = new RincianHarga(hargaDasar);
    }

    public String getNamaItem() {
        return this.namaItem;
    }

    public RincianHarga getRincian() {
        return this.rincian;
    }
}