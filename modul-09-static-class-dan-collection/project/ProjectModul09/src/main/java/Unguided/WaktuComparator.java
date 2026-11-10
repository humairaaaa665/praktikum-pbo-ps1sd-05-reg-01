package Unguided;

import java.util.Comparator;

public class WaktuComparator implements Comparator<HasilEksperimen> {
    // urutan: waktu training tercepat ke terlama
    @Override
    public int compare(HasilEksperimen e1, HasilEksperimen e2) {
        return Integer.compare(e1.getWaktuTraining(), e2.getWaktuTraining());
    }
}