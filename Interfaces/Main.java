// Write down a high-level abstraction of the following specification on the answer sheet; implement it
// and test it.
// Consider a class Person and its two subclasses named Student and Employee. Make Faculty and Staff
// subclasses of Employee. A person has a name, address, phone number, and email address. A student has a
// registration number. An employee has an office and salary. A faculty member has a rank. A staff member
// has a title. Override the toString method in each class to display the person’s name. Write a test program
// that creates a Person, Student, Employee, Faculty, and Staff object and invokes their toString() methods

class Person{
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    @Override
    public String toString() {
        return "Name: "+name;
    }
}

class Student extends Person{
    private String registrationNumber;
    
    public Student(String name, String address, String phoneNumber, String emailAddress, String registrationNumber) {
        super(name, address, phoneNumber, emailAddress);
        this.registrationNumber = registrationNumber;
    }
    
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nRegistration Number: "+registrationNumber;
    }
}

class Employee extends Person{
    private String office;
    private double salary;
    
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }
    
    public String getOffice() {
        return office;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nOffice: "+office+"\nSalary: "+salary;
    }
}

class Faculty extends Employee{
    private String rank;
    
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.rank = rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getRank() {
        return rank;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nRank: "+rank;
    }
}

class Staff extends Employee{
    private String title;
    
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nTitle: "+title;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Smith", "1st Street", "1234567890", "john.smith@gmail.com");
        Student student = new Student("Alice Johnson", "2nd Street", "9087654321", "alice.johnson@gmail.com", "22MCA0106");
        Employee employee = new Employee("Robert Davis", "3rd Street", "1122334455", "robert.davis@gmail.com","A-101",50000.0);
        Faculty faculty = new Faculty("Mary Williams", "4th Street", "9988776655", "mary.williams@gmail.com","B-201",80000.0,"Professor");
        Staff staff = new Staff("James Brown", "5th Street", "5544332211", "james.brown@gmail.com" ,"C-301",40000.0,"Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}
