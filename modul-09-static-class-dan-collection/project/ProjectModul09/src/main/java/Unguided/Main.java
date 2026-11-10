package Unguided;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<HasilEksperimen> list = new ArrayList<>();
        list.add(new HasilEksperimen("Logistic Regression", 0.82, 12));
        list.add(new HasilEksperimen("Random Forest", 0.91, 45));
        list.add(new HasilEksperimen("SVM", 0.87, 60));
        list.add(new HasilEksperimen("KNN", 0.79, 5));
        list.add(new HasilEksperimen("Decision Tree", 0.84, 8));

        // 1. Jumlah eksperimen (static method)
        System.out.println("Jumlah eksperimen: " + HasilEksperimen.getJumlahEksperimen());

        // 2. Sorting default (Comparable) -> akurasi tertinggi
        Collections.sort(list);
        System.out.println("Sorted by akurasi");
        list.forEach(System.out::println);

        // 3. Sorting Comparator -> waktu training tercepat
        Collections.sort(list, new WaktuComparator());
        System.out.println("Sorted by waktu training");
        list.forEach(System.out::println);

        // 4. Filtering lambda -> akurasi minimal 0.85
        System.out.println("Model dengan akurasi minimal 0.85");
        List<HasilEksperimen> hasilFilter = list.stream()
                .filter(e -> e.getAkurasi() >= 0.85)
                .sorted() // urut akurasi tertinggi agar sesuai contoh output
                .collect(Collectors.toList());
        hasilFilter.forEach(System.out::println);

        // 5. Pencarian lambda -> model KNN
        System.out.println("Pencarian model KNN");
        System.out.println(list.stream()
                .filter(e -> e.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null));
    }
}