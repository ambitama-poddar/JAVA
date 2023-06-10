// . Create a class called Cab to represent a cab on hire. A cab should include four pieces of information as
// instance variables - a cab registration number (type String), name of the driver (type String), the rate per
// kilometer (type double) and the total distance it covered on hire on a day (type double). The Cab class
// should have a constructor that initializes the four instance variables. Provide a set and a get method for
// each instance variable. In addition, provide a method named computeIncome that calculates the daily
// income based on the total distance that it travelled on hire and returns the daily income as a double
// value. The registration number and driver name must be available and the rate per kilometer and total
// distance cannot be negative. Write a test application named Income that demonstrates creation of an
// array of objects of size three of the Cab class and display the daily income from each cab along with its
// registration number and driver’s name.

// import java.util.Scanner;

import java.util.Scanner;

class Cab{
    private String regNo;
    private String name;
    private double ratePerKm;
    private double totalDistance;

    public Cab(String regNo, String name, double ratePerKm, double totalDistance) {
        this.regNo = regNo;
        this.name = name;
        this.ratePerKm = ratePerKm;
        this.totalDistance = totalDistance;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double computeIncome(){
        return this.ratePerKm*this.totalDistance;
    }

    @Override
    public String toString() {
        return "Cab [name=" + name + ", ratePerKm=" + ratePerKm + ", regNo=" + regNo + ", totalDistance=" + totalDistance
                + "]";
    }

}

public class Income {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cab[] cabs=new Cab[3];
        for(int i=0;i<cabs.length;i++){
            System.out.println("Enter details for cab "+(i+1));
            System.out.print("Enter registration number: ");
            String regNo=sc.next();
            System.out.print("Enter driver name: ");
            String name=sc.next();
            System.out.print("Enter rate per km: ");
            double ratePerKm=sc.nextDouble();
            System.out.print("Enter total distance: ");
            double totalDistance=sc.nextDouble();

            cabs[i]=new Cab(regNo, name, ratePerKm, totalDistance);
        }
        
        int i = 1;
        for(Cab cab:cabs){
            double income=cab.computeIncome();
            System.out.println("Cab "+i+": "+cab);
            System.out.println("Reg. No.: "+cab.getRegNo());
            System.out.println("Driver Name: "+cab.getName());
            System.out.println("Daily Income: "+income);
        }

        sc.close();
    }    
}