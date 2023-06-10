// Create a class called Employee that includes three instance variables—a first name (type String), a last
// name (type String) and a monthly salary (double). Provide a constructor that initializes the three
// instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not
// positive, do not set its value. Write a test app named EmployeeTest that demonstrates class Employee’s
// capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
// Employee a 10% raise and display each Employee’s yearly salary again.


class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(this.monthlySalary>0){
            this.monthlySalary = monthlySalary;
        }
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", monthlySalary=" + monthlySalary + "]";
    }

    public double yearlySalary(){
        return this.monthlySalary*12;
    }

    public double computeYearlySalaryWithRaise(){
        return (this.monthlySalary*12)*1.1;
    }
}

public class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Doe", 1000.0);
        Employee e2 = new Employee("Jane", "Doe", 2000.0);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("Yearly salary of "+e1.getFirstName()+" "+e1.getLastName()+" is "+e1.yearlySalary());
        System.out.println("Yearly salary of "+e2.getFirstName()+" "+e2.getLastName()+" is "+e2.yearlySalary());
        e1.computeYearlySalaryWithRaise();
        e2.computeYearlySalaryWithRaise();
        System.out.println("Yearly salary of "+e1.getFirstName()+" "+e1.getLastName()+" after raise is "+e1.computeYearlySalaryWithRaise());
        System.out.println("Yearly salary of "+e2.getFirstName()+" "+e2.getLastName()+" after raise is "+e2.computeYearlySalaryWithRaise());
    }
}
