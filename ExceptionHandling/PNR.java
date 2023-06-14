// package ExceptionHandling;

import java.util.Scanner;

// Develop a Passenger class with PNR number as one of its characteristics apart from her/his name and age. The
// characteristics are the private instance fields of the Passenger class. Provide get and set methods for the instance fields and a
// three argument constructor to construct a Passenger object. The Passenger information should be entered through keyboard.
// A PNR number is regarded as a valid PNR number if it has eleven characters and there is a hyphen (-) at the fourth position of
// the PNR number. If either of these requirements is not met then an InvalidPNRNumber exception should be thrown. A
// NameCaseException should be thrown, if the name is not entered in upper case letters and an InvalidAgeException should be
// thrown if the age is entered either as a negative number. Write a driver class to test the custom exceptions using try-catchfinally blocks

class Passenger {
    private String name;
    private int age;
    private String pnrNumber;

    public Passenger(String name, int age, String pnrNumber) {
        this.name = name;
        this.age = age;
        this.pnrNumber = pnrNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", age=" + age + ", pnrNumber=" + pnrNumber + "]";
    }

}

class InvalidPNRNumber extends Exception {
    public InvalidPNRNumber(String message) {
        super(message);
    }

    public InvalidPNRNumber() {
        System.out.println("Default InvalidPNRNumber error");
    }

    @Override
    public String toString() {
        return "InvalidPNRNumber [message=" + getMessage() + "]";
    }

}

class NameCaseException extends Exception {
    public NameCaseException(String message) {
        super(message);
    }

    public NameCaseException() {
        System.out.println("Default NameCaseException error");
    }

    @Override
    public String toString() {
        return "NameCaseException [message=" + getMessage() + "]";
    }

}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException() {
        System.out.println("Default InvalidAgeException error");
    }

    @Override
    public String toString() {
        return "InvalidAgeException [message=" + getMessage() + "]";
    }

}

public class PNR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter pnr number: ");
            String pnr = sc.next();
            if ((pnr.length() != 11) && pnr.charAt(3) != '-') {
                throw new InvalidPNRNumber(
                        "Pnr number should be of 11 characters and contain hypen(-) at the fourth position");
            }

            System.out.println("Enter passenger name: ");
            String name = sc.next();
            if (!(name.equals(name.toUpperCase()))) {
                throw new NameCaseException("Name should be in uppercase characters");
            }

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            if (age < 0) {
                throw new InvalidAgeException("Age should be a positive number");
            }
        } catch (InvalidPNRNumber e) {
            e.printStackTrace();
        } catch (NameCaseException e) {
            e.printStackTrace();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
