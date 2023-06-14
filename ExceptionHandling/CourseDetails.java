// package ExceptionHandling;

// Develop a class called Course containing course code, course name and 
// number of credits assigned for the course.  Read courses’ information through keyboard. 
// Develop a user-defined exception called InvalidCreditAssigned to throw exception whenever 
// the number of credit assigned to a course is less than three and an exception called InValidCourseCode 
// should also be thrown if the course code does not start with AEC.  Show the usage of these exceptions in try-catch-finally block and in throws clause.

import java.util.Scanner;

class Course{
    private String courseCode;
    private String courseName;
    private int noOfCredits;

    public Course(String courseCode, String courseName, int noOfCredits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.noOfCredits = noOfCredits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    @Override
    public String toString() {
        return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", noOfCredits=" + noOfCredits + "]";
    }
}

class InValidCourseCode extends Exception{
    public InValidCourseCode(String message){
        super(message);
    }

    public InValidCourseCode(){
        System.out.println("Default InValidCourseCode error");
    }

    @Override
    public String toString() {
        return "InValidCourseCode [message="+getMessage()+"]";
    }

}

 class InvalidCreditAssigned extends Exception{
    public InvalidCreditAssigned(String message){
        super(message);
    }

    public InvalidCreditAssigned(){
        System.out.println("Default InvalidCreditAssigned error");
    }

    @Override
    public String toString() {
        return "InvalidCreditAssigned [message="+getMessage()+"]";
    }

 }

public class CourseDetails {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter course code: ");
            String courseCode=sc.next();
            if(!courseCode.startsWith("AEC")){
                throw new InValidCourseCode("Invalid course code");
            }

            System.out.println("Enter course name: ");
            String courseName=sc.next();
            
            System.out.println("Enter no of credits: ");
            int noOfCredits=sc.nextInt();
            if(noOfCredits<3){
                throw new InvalidCreditAssigned("Number of credits cannot be less than 3");
            }
            
        } catch (InValidCourseCode e) {
            e.printStackTrace();
        }catch (InvalidCreditAssigned e){
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}
