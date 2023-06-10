// Create a class called Date that includes three instance variables—a month (type int), a day (type int)
// and a year (type int). Provide a constructor that initializes the three instance variables and assumes that
// the values provided are correct. Provide a set and a get method for each instance variable. Provide a
// method displayDate that displays the month, day and year separated by forward slashes (/). Write a test
// app named DateTest that demonstrates class Date’s capabilities.

class Date{
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
    }  
    
    public void displayDate(){
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(12, 12, 2020);
        date.displayDate();

        // Updating the date
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2023);
        date.displayDate();
    }
}