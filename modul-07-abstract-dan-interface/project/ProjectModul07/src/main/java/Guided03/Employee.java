package Guided03;

//fondasi umum yang belum memiliki peran spesifik sehingga tidak boleh diinstansiasi langsung 
public abstract class Employee implements Payable{  
    private String name;
    
    //constructur 
    public Employee(String name) { 
        this.name = name; 
    } 

    //getter 
    public String getName() { 
        return name; 
    } 

    //method, Setiap pegawai pasti punya gaji, tapi rumusnya berbeda-beda 
    public abstract double earnings(); 

    //saat ada penagihan, alihkan langsung ke metode kalkulasi gaji (earnings) 
    @Override 
    public double getPaymentAmount(){ 
        return earnings(); 
    } 
} 