package Guided02;

    //Benda mati non-pegawai, tapii tetap diikat oleh aturan 
public class Invoice implements Payable { 
    private  String partName; 
    private int quantity; 
    private double pricePerItem; 
     
    public Invoice(String partName, int quantity, double pricePerItem){ 
        this.partName = partName; 
        this.quantity = quantity; 
        this.pricePerItem = pricePerItem; 
    } 
     
    public String getPartName(){ 
        return partName; 
    } 
     
    @Override 
    public double getPaymentAmount(){ 
        return quantity * pricePerItem; 
    } 
}