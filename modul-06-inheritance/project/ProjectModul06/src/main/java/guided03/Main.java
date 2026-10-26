package guided03;

public class Main { 
    public static void main(String[] args){ 
        Lagu d,e; 
        d = new Lagu(); 
        e = new Lagu(); 
         
        d.IsiParam("Magnolia"); 
        e.IsiParam("33x", "Perunggu"); 
         
        d.tampilkan(); 
        e.tampilkan(); 
    } 
} 