// package ExceptionHandling;

import java.util.Scanner;

// Develop a class called Student containing registration number, name 
// and total credits registered by a student.  Read students’ information through keyboard. 
// Develop a user-defined exception called CreditsOutOfRange to throw exception whenever 
// the total number of credits registered by a student is either less than 16 or greater than 24 
// and an exception called NameCaseException should also be thrown if the name of a student 
// is not entered in upper case letters. Show the usage of these exceptions in try-catch-finally block and in throws clause. 

class Student {
    private String regNo;
    private String name;
    private int credits;
    
    public Student(String regNo, String name, int credits) {
        this.regNo = regNo;
        this.name = name;
        this.credits = credits;
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

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Student [regNo=" + regNo + ", name=" + name + ", credits=" + credits + "]";
    }
    
}

class NameCaseException extends Exception{
    public NameCaseException(String message){
        super(message);
    }

    public NameCaseException(){
        System.out.println("Default NameCaseException error");
    }

    @Override
    public String toString() {
        return "NameCaseException [message="+getMessage()+"]";
    }
}

class CreditsOutOfRange extends Exception{
    public CreditsOutOfRange(String message){
        super(message);
    }

    public CreditsOutOfRange(){
        System.out.println("Default CreditsOutOfRange error");
    }

    @Override
    public String toString() {
        return "CreditsOutOfRange [message="+getMessage()+"]";
    }

    
}

public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            System.out.println("Enter reg no: ");
            String regNo=sc.nextLine();

            System.out.println("Enter name: ");
            String name=sc.next();
            if(!name.equals(name.toUpperCase())){
                throw new NameCaseException("Name should be in upper case");
            }

            System.out.println("Enter no of credits: ");
            int credits=sc.nextInt();
            if(credits<16 || credits>24){
                throw new CreditsOutOfRange("Credits should be between 16 and 24");
            }
        }catch(NameCaseException e){
            e.printStackTrace();
        }catch(CreditsOutOfRange e){
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
