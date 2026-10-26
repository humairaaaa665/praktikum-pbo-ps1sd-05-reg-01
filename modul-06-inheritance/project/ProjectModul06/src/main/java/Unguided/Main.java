package Unguided;

public class Main {
    public static void main(String[] args) {
        ModelRegresi regresi = new ModelRegresi("Regresi Linier", 500, 4);

        ModelML[] daftarModel = {
            regresi,
            new ModelKlasifikasi("Decision Tree", 800, 3),
            new ModelDeepLearning("Neural Network", 1000, 5, 3)
        };

        int total = 0;
        for (ModelML m : daftarModel) {
            m.tampilInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            total += biaya;
        }

        System.out.println("Total biaya: " + total);
        System.out.println("Biaya 10 epoch (Neural Network): " + daftarModel[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + regresi.hitungBiaya(10));
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}