package guided2.Agregasi; 
 
public class Main { 
    public static void main(String[] args) { 
        runAsosiasi(); 
    } 
 
    public static void runAgregasi() {} 
 
    public static void runAsosiasi() { 
        Mahasiswa m1 = new Mahasiswa("103132400038", "Humaira"); 
        Mahasiswa m2 = new Mahasiswa("103132400016", "Andita"); 
 
        Jurusan prodi = new Jurusan("SD", "Sains Data"); 
 
        prodi.AddMahasiswa(m1); 
        prodi.AddMahasiswa(m2); 
 
        prodi.DisplayMahasiswa(); 
    } 
}