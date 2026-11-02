package Guided01;

public class Main { 
     
    public static void main(String[]args){ 
        SalariedEmployee salaried = new SalariedEmployee("Humairah", 5000000); 
        System.out.println("Nama: "+salaried.getName()); 
        System.out.println("Gaji: Rp "+ salaried.earnings()); 
    } 
}