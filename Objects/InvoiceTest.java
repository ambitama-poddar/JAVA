// Create a class called Invoice that a hardware store might use to represent an invoice for an item sold
// at the store. An Invoice should include four pieces of information as instance variables—a part number
// (type String), a part description (type String), a quantity of the item being purchased (type int) and a
// price per item (double). Your class should have a constructor that initializes the four instance variables.
// Provide a set and a get method for each instance variable. In addition, provide a method named
// getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
// then returns the amount as a double value. If the quantity is not positive, it should be set to 0. If the
// price per item is not positive, it should be set to 0.0. Write a test app named InvoiceTest that
// demonstrates class Invoice’s capabilities.

import java.util.Scanner;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
        if(this.quantity!=0){
            return this.quantity*this.pricePerItem;
        }
        else{
            return 0.0;
        }
        
    }

    @Override
    public String toString() {
        return "Invoice [partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity
                + ", pricePerItem=" + pricePerItem + "]";
    }  
}

public class InvoiceTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter part number: ");
        String partNumber=sc.nextLine();
        System.out.println("Enter part description: ");
        String partDescription=sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity=sc.nextInt();
        System.out.println("Enter price per item: ");
        double pricePerItem=sc.nextDouble();
        Invoice invoice=new Invoice(partNumber,partDescription,quantity,pricePerItem);
        System.out.println("Invoice amount: "+invoice.getInvoiceAmount());
        sc.close();
    }
}
